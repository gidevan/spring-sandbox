package org.vsanyc.sandbox.spring.core.simple.base.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.vsanyc.sandbox.spring.core.simple.base.annotation.ContextIdAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Optional;
import java.util.stream.Stream;

@Component
public class ContextIdPostProcessor implements BeanPostProcessor {

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class beanClass = bean.getClass();
        if (beanClass.isAnnotationPresent(ContextIdAnnotation.class)) {
            Field[] fields = beanClass.getDeclaredFields();
            Optional<Field> field = Stream.of(fields)
                    .filter(f -> "contextId".equals(f.getName()))
                    .findFirst();
            Annotation[] annotations = beanClass.getAnnotations();
            Optional<Annotation> annotationOpt = Stream.of(annotations)
                    .filter(a -> a.annotationType().equals(ContextIdAnnotation.class))
                    .findFirst();
            if (annotationOpt.isPresent() && field.isPresent()) {
                ContextIdAnnotation annotation = (ContextIdAnnotation)annotationOpt.get();

                Field f = field.get();
                f.setAccessible(true);
                try {

                    f.set(bean, annotation.value());
                } catch (IllegalAccessException e) {
                    System.out.println("Bean " + beanName + " is not initialized with ContextIdAnnotation");
                }

            }
        }
        return bean;
    }
}
