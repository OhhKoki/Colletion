package com.example.set;

import org.junit.Test;

import java.util.HashSet;

/**
 * HashSet 源码浅析，结论如下：
 *
 *      1. HashSet 底层是 HashMap
 *
 *      2. 添加元素流程：
 * 	        1）获取元素的 hash 值;
 * 	        2）将 hash 值转为 table 的 index;
 * 	        3）判断 table 的 index 处是否已经存在元素：
 *     	        1. 不存在：直接将元素添加到该位置;
 * 		        2. 已存在：调用 equals() 进行比较，如果相同，则不添加。如果不相同，则添加在链表的最后;
 *
 *      3. 在 JDK1.8 中，如果一条链表的元素个到达 TTEEIFY_THRESHOLD（默认值为8），并且 table >= MIN_TREEIFY_CAPACITY（默认值为64），就会转为红黑树
 */
@SuppressWarnings("all")
public class HashSetSourceTracking {

    @Test
    public void test01() {
        HashSet set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("令牌");
        set.add("令牌");
        System.out.println(set);
    }

}
