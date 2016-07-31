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
    public void addAll(CountMap<T> cm) {
        for (T key : cm.toMap().keySet()){
            map.put(key, map.get(key) == null ? cm.getCount(key) : map.get(key) + cm.getCount(key));
        }
    }

    @Override
    public Map<T, Integer> toMap() {
        return this.map;
    }

    @Override
    public void toMap(Map destination) {
        destination = this.map;
    }
}
