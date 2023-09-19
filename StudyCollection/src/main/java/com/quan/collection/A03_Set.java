package com.quan.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set集合中的对象不按特定顺序排列
 * 只是简单的吧对象放在集合中，单Set集合不能包含重复的对象
 * Set集合由Set接口和Set接口的实现类组成，
 * Set接口继承Collection接口，包含Collection的所有方法
 */
public class A03_Set {
    public static void main(String[] args) {
        HashSetMethod();
        TreeSetMethod();
    }

    /**
     * HashSet类实现了Set接口，有哈希表（实际上是一个HashMap实例）支持
     * 他不保证Set集合的迭代顺序，特别是他不保证该顺序永恒不变
     * 此类允许使用 null 元素
     */
    private static void HashSetMethod() {
        // 创建一个 HashSet 实例
        Set<String> set = new HashSet<>();

        // 添加元素
        set.add("apple");
        set.add("banana");
        set.add("orange");

        System.out.println("HashSet 中的元素：" + set);

        // 判断元素是否存在
        boolean containsApple = set.contains("apple");
        boolean containsGrape = set.contains("grape");

        System.out.println("HashSet 中是否包含 apple：" + containsApple);
        System.out.println("HashSet 中是否包含 grape：" + containsGrape);

        // 删除元素
        set.remove("banana");
        System.out.println("删除 banana 后的 HashSet：" + set);

        // 获取元素个数
        int size = set.size();
        System.out.println("HashSet 中的元素个数：" + size);

        // 清空 HashSet
        set.clear();
        System.out.println("清空后的 HashSet：" + set);
    }

    /**
     * TreeSet类不仅实现了Set接口，还实现了java.util.SortedSet接口
     * 因此TreeSet类实现的Set集合在遍历集合时按照自然顺序递增排序，也可以按照指定指定比较器递增排列
     * 即可以通过 比较器 对 TreeSet 类实现的 Set 集合中的对象进行排序
     */
    private static void TreeSetMethod() {
        Set<String> set = new TreeSet<>();
    }

}
