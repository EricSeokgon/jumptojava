package threads;

/**
 * Project: jumptojava
 * FileName: Test
 * Date: 2016-04-13
 * Time: 오전 12:27
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Test extends Thread {
    public void run() {
        System.out.println("thread run.");
    }

    public static void main(String[] args) {
        final Test test = new Test();
        test.start();
    }
}
