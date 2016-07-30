package ru.sbt.classes;

import java.util.Map;

/**
 * Created by Артем on 31.07.2016.
 */
public interface CountMap<T> {
    void add(T o);

    int getCount(T o);

    int size();

    void addAll(CountMap<T> cm);

    Map<T, Integer> toMap();

    void toMap(Map destination);

}
