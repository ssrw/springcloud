package com.javapoint;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

class Test
{
public static void main(String[] args) 
{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");   
	Student a=(Student)ctx.getBean("studentbean");
	a.display();
}
}