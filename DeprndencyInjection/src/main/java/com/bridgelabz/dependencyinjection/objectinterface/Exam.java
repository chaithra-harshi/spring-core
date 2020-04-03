/******************************************************************************
 *  Purpose: Class is created to run the program in this it is using bean.xml
 *  		 to inject the dependency
 *
 *  @author  chaithra
 ******************************************************************************/

package com.bridgelabz.dependencyinjection.objectinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stud = context.getBean("cheating", Student.class);
		stud.startCheat();
	}
}
