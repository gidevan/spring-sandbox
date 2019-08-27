package org.vsanyc.sandbox.spring.core.post.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class FirstOrderedBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        System.out.println("FirstOrderedBeanPostProcessor.getOrder()");
        return 10;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("FirstOrderedBeanPostProcesso.postProcessBeforeInitializationr");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("FirstOrderedBeanPostProcessor.postProcessAfterInitialization");
        return bean;
    }
}
