package com.example.list;

import org.junit.Test;

import java.util.List;
import java.util.Vector;

/**
 * Vector 源码浅析，结论如下：
 *
 *      1. Vector 对象中维护了一个 Object 类型的数组 elementData;
 *
 *      2. Vector 中的方法存在 synchronized 声明，即安全但效率低;
 *
 *      3. 当创建 Vector 对象时，如果使用的是无参构造器，则初始 elementData 容量为 10，如果后续需要扩容，则扩容为当前容量的 2 倍;
 *
 *      4. 如果使用的是指定容量的构造器，则初始容量为指定值，如果后续需要扩容，则扩容为当前容量的 2 倍;
 */
@SuppressWarnings("all")
public class VectorSourceTracking {

    @Test
    public void test01() {

        // 无参构造
        List list01 = new Vector();
        for (int i = 1; i <= 15; i++) {
            list01.add(i);
        }

        // 有参构造
        List list02 = new Vector(8);
        for (int i = 1; i <= 15; i++) {
            list02.add(i);
        }
    }

}
