package com.bridgelabz.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 by name injection configure in xml
 *
 *  
 ******************************************************************************/

public class Body {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human human = context.getBean("humanClass", Human.class);
		human.startPumping();

	}

}
