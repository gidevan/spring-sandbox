package org.vsanyc.sandbox.spring.core.scope;

import org.springframework.stereotype.Component;

@Component
public class AnotherSingletonBean {

    private PrototypeBean prototypeBean1;

    private PrototypeBean prototypeBean2;

    public AnotherSingletonBean(PrototypeBean prototypeBean1, PrototypeBean prototypeBean2) {
        this.prototypeBean1 = prototypeBean1;
        this.prototypeBean2 = prototypeBean2;
    }

    public void showPrototypeInfo() {
        System.out.println("prototypeBean1 getName():" + prototypeBean1.getName());
        System.out.println("prototypeBean2 getName():" + prototypeBean2.getName());
    }
}
