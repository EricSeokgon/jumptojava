package OOP;

/**
 * Project: jumptojava
 * FileName: ZooKeeper
 * Date: 2016-03-25
 * Time: 오전 12:35
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ZooKeeper {
    public void feed(Tiger predator) {
        System.out.println("feed " + predator.getName());
    }

    public static void main(String[] args) {
        final Tiger tiger = new Tiger();
        tiger.setName("tiger");

        final Lion lion = new Lion();
        lion.setName("lion");

        final Crocodile crocodile = new Crocodile();
        crocodile.setName("crocodile");

        final ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.feed(crocodile);
    }

    private void feed(Crocodile crocodile) {
    }

    private void feed(Lion lion) {
    }
}
