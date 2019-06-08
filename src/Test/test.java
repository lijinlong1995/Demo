package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext  context  = new  ClassPathXmlApplicationContext("mybatis/applicationContext.xml");
		//HelloSpring  helloSpring = (HelloSpring)context.getBean("helloSpring");
		//helloSpring.print();
		Print print = (Print)context.getBean("print");
		String content = "Spring 是一个开源的控制反转（Inversion of Control，IoC）和面向切面（AOP）的容器框架。它的主要目的是使现有技术更加易用，推荐编码最佳实现，从而简化企业开发。"
				+ "\r\n" + 
				"Spring 目前已经发展为一个功能丰富而易用的集成框架，其核心是一个完整的控制反转（IoC）的轻量级容器，"
				+ "用户可以使用他建立自己的应用程序。在容器上，Spring提供了大量实用的服务。将很多高质量的开源项目集成到统一的框架上。\r\n" + 
				"Spring致力于Java EE 应用的各种解决方案，而不是仅仅专注于某一层面的方案。可以说，Spring是企业应用开发的“一站式”选择，"
				+ "Spring贯穿表示层、业务层、持久层。然而，Spring并不想取代那些已有的框架，而以高度的开发性与他们无缝整合。";
		print.print(content);
	}
	
	
}
