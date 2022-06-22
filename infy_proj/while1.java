package infy_proj;

public class while1 {
    public static void main(String[] args) {
        int num = 7865;
        int sum = 0;
        int temp = 0;
        while (num > 0) {
            temp = num % 10;
            sum += temp;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
