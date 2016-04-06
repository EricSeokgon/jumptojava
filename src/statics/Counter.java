package statics;

/**
 * Project: jumptojava
 * FileName: Counter
 * Date: 2016-04-07
 * Time: 오전 12:03
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Counter {
    static int count = 0;

    Counter() {
        this.count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        final Counter c1 = new Counter();
        final Counter c2 = new Counter();
        System.out.println(Counter.getCount());
    }
}
