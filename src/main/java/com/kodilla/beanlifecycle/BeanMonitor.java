package com.kodilla.beanlifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanMonitor implements BeanPostProcessor {

    private final Logger logger = LoggerFactory.getLogger(BeanMonitor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("Before initialization of the bean: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("After initialization of bean: " + beanName);
        return bean;
    }

    //metody pozwalają na zmodyfikowanie beana podczas jego tworzenia - przed i po inicjalizacji
    //mechanizm mozna wykorzystac do globalnej zmiany zachowania niektorych beanow - piszac kod tylko w jednym miejsu

}
