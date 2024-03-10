package com.kodilla.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanLifecycleApplication {

	private static TaskPostProcessorOfBeansController t = new TaskPostProcessorOfBeansController();

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfiguration.class);
		context.refresh();

		LibraryManager manager = context.getBean(LibraryManager.class);
		System.out.println("Context and beans are set up and ready to work");

		context.close();

	}

}
