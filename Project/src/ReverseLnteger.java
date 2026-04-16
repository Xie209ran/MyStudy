import java.util.Scanner;

public class ReverseLnteger {
    public static int reverse1(int num) {
        int result = 0;
        while (num != 0) {
            int digit = num % 10;
            result = result * 10 + digit;
            num /= 10;
        }
        return result;
    }

    public static int reverse2(int num) {
        int result = 0;
        int i = 0;
        int temp =num;
        for (; temp != 0; i++) {
            temp = temp / 10;
        }
        for (int j = 0; j < i; j++) {
            int digit = num % 10;
            result = result * 10 + digit;
            num = num / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();
        System.out.println("反转后为"+reverse2(num));
        System.out.println("反转后为"+reverse1(num));
    }
}