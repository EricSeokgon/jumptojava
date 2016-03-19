package OOP;

/**
 * Project: jumptojava
 * FileName: Counter
 * Date: 2016-03-20
 * Time: 오전 12:08
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
class Updator {
    public void update(Counter counter) {
        counter.count++;
    }
}

public class Counter {
    int count = 0;
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updator myUpdator = new Updator();
        myUpdator.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}