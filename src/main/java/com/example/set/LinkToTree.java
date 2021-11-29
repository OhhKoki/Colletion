package com.example.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet 集合什么时候会将链表转为红黑树：
 *      1. HashSet 的底层是 HashMap;
 *      2. 使用无参构造创建一个 HashSet 时，会维护了一个大小为 16 的 Node[]；
 *      3. 每次添加元素时，会根据 key 的 hash 值，进行 & 操作，得到一个 [0,15] 的 index;
 *      4. 对于 table[index] 而言，如果 table 数组的 index 位置上的链表的 size 大于 8，且 table.length >= 64，则将 table[index] 处的链表转为红黑树;
 */
@SuppressWarnings("all")
public class LinkToTree {

    @Test
    public void test01() {
        Set set = new HashSet();

        for (int i = 1; i <= 8; i ++) {
            set.add(new A(i));
        }

        System.out.println("添加了 8 个元素");

        set.add(new A(9));
        set.add(new A(10));
        set.add(new A(11));
        set.add(new A(12));

        System.out.println(set);
    }

    class A {
        private int num;

        public A(int num) {
            this.num = num;
        }

        @Override
        public int hashCode() {
            // return Objects.hash(num);
            // 此处特意将返回的 hashCode 设置成一个指定值，让 HashSet 添加 A 类对象时，保证所有元素都已一个 index 处
            return 100;
        }
    }

}
