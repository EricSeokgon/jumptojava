package Control;

/**
 * Project: jumptojava
 * FileName: For
 * Date: 2016-03-16
 * Time: 오전 12:16
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class For {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};

        for (int i = 0; i < numbers.length; i++) {
            String number = numbers[i];
            System.out.println(number);
        }
        for (String number : numbers) {
            System.out.println(number);
        }
        int[] marks = {90, 25, 67, 45, 80};
        for (int i = 0; i < marks.length; i++) {
            int mark = marks[i];
            if (mark >= 60) {
                System.out.println((i + 1) + "번 학생은 합격입니다.");
            } else {
                System.out.println((i + 1) + "번 학생은 불합격입니다.");
            }

        }
        for (int j = 0; j < marks.length; j++) {
            int mark1 = marks[j];
            if (mark1 < 60) {
                continue;
            }
            System.out.println((j + 1) + "번 학생 축하합니다. 합격입니다.");
        }
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }

    }
}
