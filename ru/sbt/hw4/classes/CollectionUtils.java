package ru.sbt.hw4.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Артем on 01.08.2016.
 */
public class CollectionUtils {
    public static<T> void addAll(List<? extends T> source, List<? super T> destination){
        destination.addAll(source);
    }

    public static<T> List<T> newArrayList(){
        return new ArrayList<>();
    }

    public static<T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static<T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static<T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static<T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        for (T o : c2){
            if(c1.contains(o)) return true;
        }
        return false;
    }

    public static<T extends Comparable<T>, E extends T> List<T> range(List<E> list, E min, E max) {
        return range(list, min, max, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public static<T, E extends T> List<T> range(List<E> list, E min, E max, Comparator<T> comparator){
        list.sort(comparator);
        List<T> resultList = new ArrayList<T>();
        for(T elem : list){
            if(comparator.compare(min, elem) > 0) continue;
            if (comparator.compare(max, elem) < 0) break;
            resultList.add(elem);
        }
        return resultList;
    }


}
