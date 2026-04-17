import java.util.Scanner;

//题目10：判断一个字母是否是元音
public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字母");
        char letter = sc.next().charAt(0);
        if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
            System.out.println("是元音");
        }else {
            System.out.println("不是元音");
        }
    }
}
