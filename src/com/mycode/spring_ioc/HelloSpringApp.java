package com.mycode.spring_ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Example of IOC
public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring config file: by creating spring container
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from spring container
		
		Coach coach=context.getBean("myCoach",Coach.class); //Here interface name will be passed
		//call methods on bean
		System.out.print("Method called:"+coach.getDailyWorkout());
		//close the context
		context.close();
		

	}

}
