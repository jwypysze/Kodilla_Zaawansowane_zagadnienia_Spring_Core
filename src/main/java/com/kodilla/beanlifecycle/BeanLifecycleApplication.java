package com.kodilla.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifecycleApplication {

	public static void main(String[] args) {
		// utworzenie kontekstu
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// wczytanie konfiguracji
		context.register(AppConfiguration.class);
		context.refresh();

		//utworzenie beana
		LibraryManager manager = context.getBean(LibraryManager.class);

		//wyswietlenie komunikatu
		System.out.println("Context and beans are set up and ready to work");

		context.close();
	}

}
