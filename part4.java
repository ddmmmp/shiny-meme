import java.util.ArrayList;

import java.util.Scanner;
public class part4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> eating = new ArrayList<>();
        ArrayList<Double> entertainment = new ArrayList<>();
        ArrayList<Double> learning = new ArrayList<>();
        int dayCount = 0;
        while (dayCount < 7) {
            System.out.println("请输入1记录吃，2记录娱乐，3记录学习，输入next进入下一天：");
            String input = scanner.next();
            if (input.equals("next")) {
                dayCount++;
                System.out.println("进入第 " + (dayCount + 1) + " 天");
                continue;
            }
            int category = Integer.parseInt(input);
            System.out.println("请选择：1-收入，2-支出");
            int type = scanner.nextInt();
            System.out.println("请输入具体金额：");
            double amount = scanner.nextDouble();

            if (type == 2) {
                amount = -amount;
            }
            switch (category) {
                case 1:
                    eating.add(amount);
                    break;
                case 2:
                    entertainment.add(amount);
                    break;
                case 3:
                    learning.add(amount);
                    break;
                default:
                    System.out.println("无效的类别");
                    break;
            }
        }
        System.out.println("请输入'done'结束记录并计算总收入和支出：");
        String input = scanner.next();
        if (!input.equals("done")) {
            System.out.println("无效的输入");
            return;
        }
        if (dayCount < 7) {
            System.out.println("错误：记录天数少于7天");
        } else {
            double totalIncome = 0;
            double totalExpense = 0;

            totalIncome += calculateSum(eating, true);
            totalIncome += calculateSum(entertainment, true);
            totalIncome += calculateSum(learning, true);

            totalExpense += calculateSum(eating, false);
            totalExpense += calculateSum(entertainment, false);
            totalExpense += calculateSum(learning, false);

            System.out.println("7天总收入：" + totalIncome);
            System.out.println("7天总支出：" + totalExpense);
        }

        scanner.close();
    }
    private static double calculateSum(ArrayList<Double> list, boolean isIncome) {
        double sum = 0;
        for (double amount : list) {
            if (isIncome && amount > 0) {
                sum += amount;
            } else if (!isIncome && amount < 0) {
                sum += amount;
            }
        }
        return sum;
    }
}