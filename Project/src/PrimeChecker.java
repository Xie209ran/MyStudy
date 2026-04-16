import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println(num + "不是质数");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(num + "是质数");
            } else {
                System.out.println(num + "不是质数");
            }
        }
    }
}

