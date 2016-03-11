package dataTypes.Lists;

import java.util.ArrayList;

/**
 * Created by hadeslee on 2016-03-09.
 */
public class Lists {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        //get
        System.out.println(pitches.get(1));

        //size
        System.out.println(pitches.size());

        //contains
        System.out.println(pitches.contains("142"));

        System.out.println(pitches.remove("129"));
        System.out.println(pitches.size());
        System.out.println(pitches.remove(0));
    }
}
