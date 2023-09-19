package com.quan.jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A01_CollectionDemo1 {
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
            System.out.println("next = " + next);
        }

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("next = " + next);
        }

    }
}
