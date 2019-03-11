package com.alibaba.cola.boot;

import java.util.Comparator;

//类比较
public class ClassNameComparator implements Comparator<Class<?>> {
    @Override
    public int compare(Class<?> o1, Class<?> o2) {
        if (o1 == null)
            return -1;
        if (o2 == null)
            return 1;
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
