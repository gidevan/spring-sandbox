package org.vsanyc.sandbox.spring.core.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by vano on 26.8.19.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Lifecycle examples");
        ApplicationContext context = new AnnotationConfigApplicationContext("org.vsanyc.sandbox.spring.core.lifecycle");
        testLifecycle(context);

    }

    private static void testLifecycle(ApplicationContext context) {
        ExampleBean exampleBean = context.getBean(ExampleBean.class);
        exampleBean.getBeanData();

    }
}
