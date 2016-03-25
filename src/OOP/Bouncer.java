package OOP;

/**
 * Project: jumptojava
 * FileName: Bouncer
 * Date: 2016-03-26
 * Time: 오전 3:09
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Bouncer {
    public void barkAnimal(Animal animal) {
        if (animal instanceof Tiger) {
            System.out.println("어흥");
        } else if (animal instanceof Lion) {
            System.out.println("으르렁");
        }
    }

    public static void main(String[] args) {
        final Tiger tiger = new Tiger();
        final Lion lion = new Lion();

        final Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }

}
