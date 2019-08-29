package org.vsanyc.sandbox.spring.core.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ExampleBeanPostProcessor implements BeanPostProcessor {
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (ExampleConstants.EXAMPLE_BEAN_NAME.equals(beanName)) {
            System.out.println("ExampleBeanPostProcessor.postProcessBeforeInitialization");
        }
        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (ExampleConstants.EXAMPLE_BEAN_NAME.equals(beanName)) {
            System.out.println("ExampleBeanPostProcessor.postProcessAfterInitialization");
        }
        return bean;
    }
}
