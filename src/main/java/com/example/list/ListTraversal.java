package com.example.list;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * 遍历 List 集合的三种方式
 */
@SuppressWarnings("all")
public class ListTraversal {

    @Test
    public void test01() {
        // List list = new ArrayList();
        // List list = new LinkedList();
        List list = new Vector();
        list.add("tom");
        list.add(10);
        list.add(true);
        list.add("tom");

        System.out.println("========== 迭代器遍历 ==========");
        // 1. 迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }

        System.out.println("========== 增强for遍历 ==========");
        // 2. 增强for遍历
        for (Object object : list) {
            System.out.println(object);
        }

        System.out.println("========== 普通for遍历 ==========");
        // 3. 普通for遍历
        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }
    }

}
