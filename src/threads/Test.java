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
    int seq;

    public Test(int seq) {
        this.seq = seq;
    }

    public void run() {

        System.out.println(this.seq + " thread start.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        System.out.println(this.seq + " thread end.");

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final Test test = new Test(i);
            test.start();
        }
        System.out.println("main end.");
    }
}
