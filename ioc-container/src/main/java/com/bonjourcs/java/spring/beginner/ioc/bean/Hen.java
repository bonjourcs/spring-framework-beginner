package com.bonjourcs.java.spring.beginner.ioc.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Liang Chenghao
 * Description: 母鸡类
 * Date: 2018/1/8
 * Time: 10:32
 */
@ToString
@Getter
@Setter
public class Hen {

    /**
     * 构造母鸡实例
     */
    private static Hen hen = new Hen();

    /**
     * 私有构造方法
     */
    private Hen() {
    }

    /**
     * 静态方法，返回构造好的母鸡实例
     * @return 一个母鸡实例
     */
    public static Hen createHen() {
        return hen;
    }

}
