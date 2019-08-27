package org.vsanyc.sandbox.spring.core.post.processor;

public interface BeanInterface {

    default String getValue() {
        return this.getClass().getCanonicalName();
    }
}
