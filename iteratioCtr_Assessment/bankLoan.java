package iteratioCtr_Assessment;

import java.util.Objects;
import java.util.Scanner;

public class bankLoan {
    public static void main(String[] args) {

        int accNo, accBal, custSal, expLoanAmt, expEmi, loanAmt = 0, emi = 0;

        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ACCOUNT NUMBER");
        accNo = scan.nextInt();

        System.out.println("Enter CUSTOMER SALARY");
        custSal = scan.nextInt();

        System.out.println("Enter ACCOUNT BALANCE");
        accBal = scan.nextInt();

        System.out.println("Enter LOAN TYPE 'Car', 'House', 'Business'");
        String loanType = sc.nextLine();

        System.out.println("Enter EXPECTED LOAN Amount");
        expLoanAmt = scan.nextInt();

        System.out.println("Enter EXPECTED Numbers of EMIs");
        expEmi = scan.nextInt();

        int len = String.valueOf(accNo).length();

        String pos = Integer.toString(accNo);

        if (len == 4 && pos.charAt(0) == '1') {

            if (accBal >= 1000) {

                if (custSal > 25000 && custSal < 50000 && Objects.equals(loanType, "Car")) {
                    loanAmt = 500000;
                    emi = 36;
                    System.out.println("Eligible Loan Amount = " + loanAmt);
                    System.out.println("Eligible EMIs = " + emi);

                } else if (custSal > 50000 && custSal < 75000 && Objects.equals(loanType, "House")) {
                    loanAmt = 600000;
                    emi = 60;
                    System.out.println("Eligible Loan Amount = " + loanAmt);
                    System.out.println("Eligible EMIs = " + emi);

                } else if (custSal > 75000 && Objects.equals(loanType, "Business")) {
                    loanAmt = 750000;
                    emi = 84;
                    System.out.println("Eligible Loan Amount = " + loanAmt);
                    System.out.println("Eligible EMIs = " + emi);

                } else {
                    System.out.println("Not ELIGIBLE  for LOAN");
                }

            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Invalid ID!!!");
        }

        scan.close();
        sc.close();
    }

}
