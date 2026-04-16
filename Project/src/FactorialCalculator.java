import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        long result = 1;
        for(int i = 1; i<num+1; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
