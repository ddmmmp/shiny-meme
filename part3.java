import java.util.Scanner;

public class part3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zhen = 0;
        int fu = 0;
        System.out.println("请输入整数输入0结束");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                zhen++;
            } else {
                fu++;
            }
            scanner = new Scanner(System.in);
        }
        System.out.println("正数个数: " + zhen);
        System.out.println("负数个数: " + fu);
    }
}
