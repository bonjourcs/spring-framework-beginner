package com.bonjourcs.java.spring.beginner.ioc.bean;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liang Chenghao
 * Description: 母鸡测试类
 * Date: 2018/1/8
 * Time: 10:37
 */
public class HenTest {

	@Test
	public void testInstantiateHenByFactoryMethod() {

		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"hen.xml"});

		Hen hen = applicationContext.getBean(Hen.class);
		Assert.assertNotNull(hen);

	}

	@Test
	public void testInstantiateChicken() {

		ApplicationContext applicationContext
				= new ClassPathXmlApplicationContext(new String[]{"hen.xml"});

		Chicken chicken = applicationContext.getBean(Chicken.class);
		Assert.assertNull(chicken.getName());
	}
}
