package org.vsanyc.sandbox.spring.core.post.processor;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;


@Component("orderedBean")
public class OrderedBean implements BeanInterface {

    @PostConstruct
    public void init() {
        System.out.println("Ordered bean init");
    }

}
