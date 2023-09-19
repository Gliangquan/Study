package com.quan.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection接口通常不能直接使用，单接口提供了添加元素，删除元素，管理元素的方法。
 * 由于List和Set接口都继承了Collection接口，因此这些方法对List集合和Set集合是通用的
 * add()
 * remove()
 * isEmpty()
 * size()
 */

public class A01_Collection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        System.out.println("collection.isEmpty() = " + collection.isEmpty());

        // 迭代器
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("next 1 = " + next);
        }

        // 迭代器不能复用
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println("next 2 = " + next);
//        }

    }
}
