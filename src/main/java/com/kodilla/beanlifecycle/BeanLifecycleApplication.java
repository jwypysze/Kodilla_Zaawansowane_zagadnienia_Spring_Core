package com.kodilla.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanLifecycleApplication {

	private static TaskPostProcessorOfBeansController t = new TaskPostProcessorOfBeansController();

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfiguration.class);
		context.refresh();


		AnyBean anyBean = context.getBean(t.create().getClass());
		AnyBean anyBean2 = context.getBean(t.create().getClass());
		AnyBean anyBean3 = context.getBean(t.create().getClass());
		AnyBean anyBean4 = context.getBean(t.create().getClass());
		AnyBean anyBean5 = context.getBean(t.create().getClass());

		context.close();

	}

}
