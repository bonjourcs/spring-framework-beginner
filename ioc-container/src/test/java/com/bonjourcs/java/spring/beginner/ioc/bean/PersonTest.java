package com.bonjourcs.java.spring.beginner.ioc.bean;

import org.junit.Assert;
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
		Assert.assertEquals("HZ.CN", person.getAddress().getName());

	}

	@Test
	public void testInstantiatePersonByConstructorBasedDI() {

		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"person.xml"});

		Person person = (Person) applicationContext.getBean("person1");
		Assert.assertEquals("BCS", person.getName());

	}

	@Test
	public void testInstantiatePersonByConstructorAndGetterDI() {

		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"person.xml"});

		Person person = (Person) applicationContext.getBean("person2");
		Assert.assertEquals(20, person.getAge());

	}

	@Test
	public void testInstantiatePersonInnerClass() {


		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"person.xml"});

		Person person = (Person) applicationContext.getBean("person3");
		Assert.assertEquals("HZ.CN", person.getAddress().getName());

	}

	@Test
	public void testInstantiatePersonWithList() {


		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"person.xml"});

		Person person = (Person) applicationContext.getBean("person4");
		Assert.assertEquals(2, person.getEmails().size());

	}

	@Test
	public void testInstantiatePersonWithMap() {


		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"person.xml"});

		Person person = (Person) applicationContext.getBean("person5");
		Assert.assertEquals(3, person.getScore().size());

	}

	@Test
	public void testCollectionMerging() {


		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"person.xml"});

		Person person = (Person) applicationContext.getBean("person6");
		Assert.assertEquals(4, person.getScore().size());

	}

	@Test
	public void testNullAndEmptyString() {

		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"person.xml"});

		Person person = (Person) applicationContext.getBean("person7");
		Assert.assertEquals(2, person.getScore().size());

	}

	@Test
	public void testPNamespace() {

		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"person.xml"});

		Person person = (Person) applicationContext.getBean("person8");
		Assert.assertEquals("BCS", person.getName());

	}

	@Test
	public void testAutoWired() {

		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"person.xml"});

		Person person = (Person) applicationContext.getBean("person9");
		Assert.assertEquals("HZ.CN", person.getAddress().getName());

	}

	@Test
	public void testAutoWiredLimitation() {

		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"person.xml"});

		Person person = (Person) applicationContext.getBean("person10");
		Assert.assertEquals("Hangzhou.China", person.getAddress().getName());

	}

}
