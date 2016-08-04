package ru.sbt.hw4.classes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Артем on 31.07.2016.
 */
public class CountMapImpl<T> implements CountMap<T> {

    private final Map<T, Integer> map;

    public CountMapImpl() {
        this.map = new HashMap<>();
    }

    @Override
    public void add(T o) {
        map.put(o, map.get(o) == null ? 1 : map.get(o) + 1);
    }

    @Override
    public int getCount(T o) {
        return map.get(o);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<? extends T> cm) { // added PECS rule
        for (T o : cm.toMap().keySet()){
            this.add(o);
        }
    }

    @Override
    public Map<? extends T, Integer> toMap() {
        return new HashMap<>(map);
    } //not returning old map anymore

    @Override
    public void toMap(Map<? extends T, Integer> destination) {
        destination = new HashMap<>(map);
    } //not assigning to old map anymore
}
