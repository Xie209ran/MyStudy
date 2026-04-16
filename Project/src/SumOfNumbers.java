import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num =sc.nextInt();

        int result = 0;
        for(int i = num;i >= 1;i--){
            result += i;
        }
        System.out.println("1到"+num+"的和为"+result);

    }
}
