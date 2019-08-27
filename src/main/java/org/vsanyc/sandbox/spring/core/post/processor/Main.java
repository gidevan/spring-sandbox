package org.vsanyc.sandbox.spring.core.post.processor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("Post processor examples");
        ApplicationContext context = new AnnotationConfigApplicationContext("org.vsanyc.sandbox.spring.core.post.processor");
        getBeanValue(context);
    }


    private static void getBeanValue(ApplicationContext context) {
        OrderedBean orderedBean = context.getBean(OrderedBean.class);
        NotOrderedBean notOrderedBean = context.getBean(NotOrderedBean.class);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("OrderedBean.getValue() " + orderedBean.getValue());
        System.out.println("OrderedBean.getValue() " + notOrderedBean.getValue());

    }

}
