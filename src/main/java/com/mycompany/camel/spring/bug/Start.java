package com.mycompany.camel.spring.bug;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) throws Exception {

		new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
		Thread.sleep(1000000);
	}
}
