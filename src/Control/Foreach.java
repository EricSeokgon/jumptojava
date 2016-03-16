package Control;

/**
 * Project: jumptojava
 * FileName: Foreach
 * Date: 2016-03-17
 * Time: 오전 7:27
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Foreach {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for (int i = 0; i < numbers.length; i++) {
            String number = numbers[i];
            System.out.println(number);
        }

        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
