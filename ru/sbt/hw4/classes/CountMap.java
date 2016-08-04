package ru.sbt.hw4.classes;

import java.util.Map;

/**
 * Created by Артем on 31.07.2016.
 */
public interface CountMap<T> {
    void add(T o);

    int getCount(T o);

    int size();

    void addAll(CountMap<? extends T> cm);

    Map<? extends T, Integer> toMap();

    void toMap(Map<? extends T, Integer> destination);

}
