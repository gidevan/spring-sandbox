package org.vsanyc.sandbox.spring.core.simple.base.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ContextIdAnnotation {

    String value();
}
