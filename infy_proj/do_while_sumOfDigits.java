package infy_proj;

public class do_while_sumOfDigits {
    public static void main(String[] args) {
        int num = 7865;
        int sum = 0;
        int temp = 0;
        do {
            temp = num % 10;
            sum += temp;
            num = num / 10;
        } while (num > 0);
        System.out.println(sum);
    }

}
