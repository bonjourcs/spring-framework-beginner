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

}
