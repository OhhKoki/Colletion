package com.example.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList 源码浅析，结论如下：
 *
 *      1. ArrayList 对象中维护了一个 Object 类型的数组 elementData;
 *
 *      2. 当创建 ArrayList 对象时，如果使用的是无参构造器，则初始 elementData 容量为 0，第一次添加，则扩容为 10，如果后续需要再次扩容，则扩容为当前容量的 1.5 倍;
 *
 *      3. 如果使用的是指定容量的构造器，则初始容量为指定值，如果后续需要扩容，则扩容为当前容量的 1.5 倍;
 */
@SuppressWarnings("all")
public class ArrayListSourceTracking {

    @Test
    public void test01() {
        // 无参构造
        List list01 = new ArrayList();
        for (int i = 1; i <= 15; i++) {
            list01.add(i);
        }

        // 有参构造
        List list02 = new ArrayList(8);
        for (int i = 1; i <= 15; i++) {
            list02.add(i);
        }
    }

}
