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
    public void sleep(){
        System.out.println(this.name+" zzz in house");
    }
    public static void main(String[] args) {
        final HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
    }
}
