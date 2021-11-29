package com.example.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * List 集合的特征
 */
@SuppressWarnings("all")
public class ListFeatures {

    /**
     * 对于 List 集合而言，元素的 add 顺序与 get 顺序是一致的，并且元素是可重复的（有序有重复）。
     */
    @Test
    public void test01() {
        List list = new ArrayList();
        list.add("tom");
        list.add("tom");
        list.add(10);
        list.add(true);
        System.out.println(list);
    }

    /**
     * 对于 List 集合而言，集合中每个元素都有其对应的唯一顺序，即索引，索引的位置从 0 开始。
     */
    @Test
    public void test02() {
        List list = new ArrayList();
        list.add("tom");
        list.add(10);
        list.add(true);
        System.out.println(list.get(1));
    }

}
