package org.vsanyc.sandbox.spring.core.simple.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.vsanyc.sandbox.spring.core.simple.base.dao.TestDao;
import org.vsanyc.sandbox.spring.core.simple.base.service.TestService;

public class Main {

    public static void main(String[] args) {
        System.out.println("Spring sandbox ");

        ApplicationContext context = new AnnotationConfigApplicationContext("org.vsanyc.sandbox.spring.core.simple.base");
        System.out.println("context id: " + context.getId());

        ApplicationContext anotherContext = new AnnotationConfigApplicationContext("org.vsanyc.sandbox.spring.core.simple.base");
        System.out.println("another context id: " + anotherContext.getId());

        System.out.println();
        System.out.println("Bean definition names:");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String name : beanDefinitionNames) {
            System.out.println(name);
        }

        testServiceTests(context);

    }

    private static void testServiceTests(ApplicationContext context) {

        System.out.println();
        System.out.println("Application context: " + context.getId());

        TestService testService = context.getBean(TestService.class);
        System.out.println();
        System.out.println("Service strings:");
        for(String string : testService.getTestStringValues()) {
            System.out.println(string);
        }

        System.out.println();
        System.out.println("Dao strings:");
        for(String string : testService.getDaoStrings()) {
            System.out.println(string);
        }

        System.out.println("testService.getContextId(): " + testService.getContextId());

        TestDao testDao = context.getBean(TestDao.class);
        System.out.println("testService.getContextId(): " + testDao.getContextId());

    }
}
