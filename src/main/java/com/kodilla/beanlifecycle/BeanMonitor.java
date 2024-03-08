package com.kodilla.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanMonitor implements BeanPostProcessor {


    //metody pozwalają na zmodyfikowanie beana podczas jego tworzenia - przed i po inicjalizacji
    //mechanizm mozna wykorzystac do globalnej zmiany zachowania niektorych beanow - piszac kod tylko w jednym miejsu

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before initialization of bean: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After initialization of bean: " + beanName);
        return bean;
    }
}
