package org.vsanyc.sandbox.spring.core.post.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class SecondOrderedBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        System.out.println("SecondOrderedBeanPostProcessor.getOrder()");
        return 5;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("SecondOrderedBeanPostProcessor.postProcessBeforeInitialization()");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("SecondOrderedBeanPostProcessor.postProcessAfterInitialization()");
        return bean;
    }
}
