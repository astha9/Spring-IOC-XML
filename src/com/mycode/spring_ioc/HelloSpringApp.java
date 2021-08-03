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

//STEPS:
		//Step1: Add configuration in ApplicationContext.xml-> With class(full path of bean) and id
		//Step2: Create an interface -Coach
		//Steps3:In main()-> Create XMLContext object and pass the name of application context
		//Step4: Use getBean method -> pass id (defined in XML file and Interface.class )
		//Step 5: using Interface ref call the function
	}

}
