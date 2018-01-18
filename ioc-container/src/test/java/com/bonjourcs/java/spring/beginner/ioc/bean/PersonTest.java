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
    public void testInstantiatePersonByConstructorAndGetterDI() {

        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext(new String[]{"person.xml"});

        Person person = (Person) applicationContext.getBean("person2");
        System.out.println(person);

    }

    @Test
    public void testInstantiatePersonInnerClass(){


        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext(new String[]{"person.xml"});

        Person person = (Person) applicationContext.getBean("person3");
        System.out.println(person);

    }

    @Test
    public void testInstantiatePersonWithList(){


        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext(new String[]{"person.xml"});

        Person person = (Person) applicationContext.getBean("person4");
        System.out.println(person);

    }

    @Test
    public void testInstantiatePersonWithMap(){


        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext(new String[]{"person.xml"});

        Person person = (Person) applicationContext.getBean("person5");
        System.out.println(person);

    }

    @Test
    public void testCollectionMerging(){


        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext(new String[]{"person.xml"});

        Person person = (Person) applicationContext.getBean("person6");
        System.out.println(person);

    }

    @Test
    public void testNullAndEmptyString(){

        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext(new String[]{"person.xml"});

        Person person = (Person) applicationContext.getBean("person7");
        System.out.println(person);

    }
    
    @Test
    public void testPNamespace(){

        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext(new String[]{"person.xml"});

        Person person = (Person) applicationContext.getBean("person8");
        System.out.println(person);

    }

    @Test
    public void testAutoWired(){

        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext(new String[]{"person.xml"});

        Person person = (Person) applicationContext.getBean("person9");
        System.out.println(person);

    }

}
