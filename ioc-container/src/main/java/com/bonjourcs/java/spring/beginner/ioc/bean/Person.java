package com.bonjourcs.java.spring.beginner.ioc.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Liang Chenghao
 * Description: 类：人
 * Date: 2018/1/8
 * Time: 10:09
 */
@ToString
@Getter
@Setter
public class Person {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 地址
     */
    private Address address;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 地址内部类
     */
    @ToString
    public static class Address {
        /**
         * 地址名称
         */
        @Getter
        @Setter
        private String name;
    }
}
