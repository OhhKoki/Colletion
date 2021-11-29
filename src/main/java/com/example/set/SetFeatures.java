package com.example.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set 集合的特征
 */
@SuppressWarnings("all")
public class SetFeatures {

    /**
     * 对于 Set 集合而言，元素的 add 顺序与 get 顺序是不一致的，并且元素是不可重复的（无顺无重复）。
     */
    @Test
    public void test01() {
        Set set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵六");
        set.add("赵六");
        System.out.println(set);
    }

    /**
     * 对于 Set 集合而言，是没有索引的，无法通过索引获取元素，所以遍历 Set 集合的时候只能使用迭代器或者增强 for 循环
     */
    @SuppressWarnings("all")
    @Test
    public void test02() {
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

        // 无法通过索引的方式进行遍历
        System.out.println("========== 普通for遍历 ==========");
        // 3. 普通for遍历
//        for (int i = 0; i < set.size(); i ++) {
//            // 没有索引方式
//        }
    }

}
