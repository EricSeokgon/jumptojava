package OOP;

/**
 * Project: jumptojava
 * FileName: CalTest
 * Date: 2016-03-19
 * Time: 오전 2:00
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CalTest {
    public int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        final CalTest calTest = new CalTest();
        int c = calTest.sum(a, b);

        System.out.println(c);
    }
}
