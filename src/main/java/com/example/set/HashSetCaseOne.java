package com.example.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 课堂练习：
 *      1. 定义一个 Employee 类，包含 name 和 age 属性;
 *      2. 创建 4 个 Employee 类对象;
 *      3. 当 name 和 age 相同时，不允许添加到集合中
 */
@SuppressWarnings("all")
public class HashSetCaseOne {

    @Test
    public void test01() {
        Set set = new HashSet();
        set.add(new Employee("zhangsan", 18));
        set.add(new Employee("lisi", 18));
        set.add(new Employee("wangwu", 18));
        set.add(new Employee("zhangsan", 18));
        System.out.println(set);
    }

    class Employee {
        private String name;
        private Integer age;

        public Employee(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return name.equals(employee.name) && Objects.equals(age, employee.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
