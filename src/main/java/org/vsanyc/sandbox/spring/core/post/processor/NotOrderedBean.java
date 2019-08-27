package org.vsanyc.sandbox.spring.core.post.processor;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("notOrderedBean")
public class NotOrderedBean implements BeanInterface {

    @PostConstruct
    public void init() {
        System.out.println("NotOrderedBean init");
    }
}
