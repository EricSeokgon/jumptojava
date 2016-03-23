package OOP;

/**
 * Project: jumptojava
 * FileName: HouseDog
 * Date: 2016-03-21
 * Time: 오후 11:42
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    }

    public HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    public void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    public static void main(String[] args) {
        final HouseDog dog = new HouseDog("happy");
        final HouseDog yorkshire = new HouseDog(1);
        System.out.println(dog.name);
        System.out.println(yorkshire.name);


    }
}
