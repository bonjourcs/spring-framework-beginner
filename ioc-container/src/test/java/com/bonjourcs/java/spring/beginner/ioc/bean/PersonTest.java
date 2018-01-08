package com.bonjourcs.java.spring.beginner.ioc.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liang Chenghao
 * Description: 测试Person类的Bean加载
 * Date: 2018/1/8
 * Time: 10:11
 */
public class PersonTest {

    @Test
    public void testInstantiatePerson() {

        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext(new String[]{"person.xml"});

        Person person = (Person) applicationContext.getBean("person0");
        System.out.println(person);

    }

    @Test
    public void testInstantiatePersonByConstructorBasedDI() {

        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext(new String[]{"person.xml"});

        Person person = (Person) applicationContext.getBean("person1");
        System.out.println(person);

    }

    @Test
    public void testInstantiatePersonByConsturctorAndGetterDI() {

        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext(new String[]{"person.xml"});

        Person person = (Person) applicationContext.getBean("person2");
        System.out.println(person);

    }

}
