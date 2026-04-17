import java.util.Scanner;

public class MaxFinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入有多少个数");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("请输入数");
        for (int i = 0;i < num;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int j = 0;j < num;j++){
            if(max<arr[j]){
                max = arr[j];
            }
        }
        System.out.println("最大值为"+max);
    }
}
