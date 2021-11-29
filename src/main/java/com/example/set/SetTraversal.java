package com.example.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 遍历 Set 集合的两种方式
 */
@SuppressWarnings("all")
public class SetTraversal {

    @SuppressWarnings("all")
    @Test
    public void test01() {
        Set set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵六");
        set.add("赵六");

        System.out.println("========== 迭代器遍历 ==========");
        // 1. 迭代器遍历
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }

        System.out.println("========== 增强for遍历 ==========");
        // 2. 增强for遍历
        for (Object object : set) {
            System.out.println(object);
        }
    }

}
