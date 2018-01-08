package com.bonjourcs.java.spring.beginner.ioc.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Liang Chenghao
 * Description: 小鸡工厂类
 * Date: 2018/1/8
 * Time: 10:42
 */
@ToString
@Getter
@Setter
public class ChickenFactory {

    /**
     * 私有化小鸡生成对象
     */
    private static Chicken chicken = new Chicken();

    /**
     * 私有化工厂构造方法
     */
    private  ChickenFactory(){}

    /**
     * 生成一个小鸡
     * @return 一个小鸡实例
     */
    public Chicken createChicken(){
        return chicken;
    }
}
