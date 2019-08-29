package org.vsanyc.sandbox.spring.core.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("Scope examples");
        ApplicationContext context = new AnnotationConfigApplicationContext("org.vsanyc.sandbox.spring.core.scope");
        testScopes(context);

        testPrototypeAsDependency(context);
        testPrototypeAsDependency(context);
    }

    private static void testScopes(ApplicationContext applicationContext) {
        System.out.println();
        System.out.println("Singleton and prototype scopes");
        SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);

        System.out.println("Singleton1 bean: " + singletonBean1.getName());
        System.out.println("Singleton2 bean: " + singletonBean2.getName());

        PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);

        System.out.println("prototype1 bean: " + prototypeBean1.getName());
        System.out.println("prototype2 bean: " + prototypeBean2.getName());
    }

    private static void testPrototypeAsDependency(ApplicationContext context) {
        System.out.println();
        System.out.println("Singleton and prototype as dependencies");

        AnotherSingletonBean anotherSingletonBean = context.getBean(AnotherSingletonBean.class);
        anotherSingletonBean.showPrototypeInfo();
    }
}
