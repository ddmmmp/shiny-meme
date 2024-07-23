import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> grades = new ArrayList<>();
        System.out.println("请输入学生成绩（输入-1结束输入）：");
        while (true) {
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            grades.add(grade);
        }
        int max = 0;
        int score = grades.get(0);
        for (int i = 1; i < grades.size(); i++) {
            if (score > 80) {
                System.out.println("A");
            } else if (score > 70) {
                System.out.println("B");
            } else if (score > 60) {
                System.out.println("C");
            } else if (score > 50) {
                System.out.println("D");
            } else {

            }
            if (score > max) {
                max = score;
            }
            score = grades.get(i);
        }
    }

}