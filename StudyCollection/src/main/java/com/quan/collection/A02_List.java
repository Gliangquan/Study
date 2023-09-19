package com.quan.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * List集合包含List接口以及List接口所有的实现类
 * List集合中的元素运行重复，各元素的顺序就是对象插入顺序，类似java数组，用户可以通过索引来访问集合中的元素
 * List接口继承Collection接口，因此包含Collection接口的所有方法
 * 此外还定义了两个很重要的方法
 * get(int index)
 * set(int index, Object obj)
 */

public class A02_List {
    public static void main(String[] args) {
//        ArrayListMethod();
//        LinkedListMethod();

        new Thread(()->{
            ArrayListMethod();
        }).start();

        new Thread(()->{
            LinkedListMethod();
        }).start();
    }

    private static void ArrayListMethod() {
        /*
         * List接口的常用实现类
         * ArrayList
         * ArrayList类实现可变的数组，允许保存所有元素，包含null，可以通过索引对元素进行快速的随机访问
         * 缺点就是：指定位置插入和删除元素的速度较慢
         */
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        arrayList.forEach(integer -> {
            System.out.println("integer 1 = " + integer);
        });
        arrayList.remove(600);
    }

    private static void LinkedListMethod() {
        /*
         * List接口的常用实现类
         * LinkedList
         * LinkedList采用链表结构保存对象，优点是：便于对象的插入与删除
         * 缺点是：对于随机访问的速度较慢
         */
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        linkedList.forEach(integer -> {
            System.out.println("integer 2 = " + integer);
        });
        linkedList.remove(600);
    }
}
