package ru.sbt;

import ru.sbt.classes.CountMap;
import ru.sbt.classes.CountMapImpl;

/**
 * Created by Артем on 31.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        System.out.println(map.getCount(5)); // 2
        System.out.println(map.getCount(6)); // 1
        System.out.println(map.getCount(10)); // 3

        CountMap<Integer> map1 = new CountMapImpl<>();

        map.add(1);

        map1.add(1);
        map1.add(1);
        map1.add(1);

        map.addAll(map1);

        System.out.println(map.getCount(1));
    }
}
