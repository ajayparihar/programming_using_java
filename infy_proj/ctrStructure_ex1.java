package infy_proj;

public class ctrStructure_ex1 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 4, num3 = 1;
        int max1 = (num1 > num2) ? num1 : num2;
        int max = (max1 > num3) ? max1 : num3;
        System.out.println(max);
    }
}
