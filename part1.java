import java.util.Scanner;
public class part1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入日期例如20240706）: ");
            String input = scanner.nextLine();
            if (input.length() != 8) {
                System.out.println("输入格式错误");
                return;
            }
            int year = Integer.parseInt(input.substring(0, 4));
            int month = Integer.parseInt(input.substring(4, 6));
            int day = Integer.parseInt(input.substring(6, 8));
            int i = 0;
            if (year % 4 == 0) {
                System.out.println(year + " 是闰年");
                i = 1;
            } else {
                System.out.println(year + " 是平年");
            }
            int[] nianri = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (i == 1) {
                nianri[1] = 29;
            }
            int j = 0;
            i = j;
            ;
            while (j < month - 1) ;{
                i = i + nianri[j];
                j++;
            }
            System.out.println(i);

        }
    }

