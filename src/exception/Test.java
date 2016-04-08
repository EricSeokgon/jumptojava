package exception;

/**
 * Project: jumptojava
 * FileName: Test
 * Date: 2016-04-09
 * Time: 오전 12:09
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public void shouldBeRun(){
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        final Test test = new Test();
        int c;
        try {
            c = 4 / 0;
            test.shouldBeRun();
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            test.shouldBeRun();
        }
    }
}
