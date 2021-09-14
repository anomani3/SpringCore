package com.ashraf.SpringCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("com/ashraf/SpringCore/Springconfig.xml");
		Student std=(Student)context.getBean("Student");
		System.out.println(std);
		if(context!=null)
		{
			context.close();
		}
		
	}

}
