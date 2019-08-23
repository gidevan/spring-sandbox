package org.vsanyc.sandbox.spring.core.simple.base.dao;

import org.springframework.stereotype.Repository;
import org.vsanyc.sandbox.spring.core.simple.base.annotation.ContextIdAnnotation;

import java.util.Arrays;
import java.util.List;

@Repository
@ContextIdAnnotation(value = "testLazyDaoAnnotationValue")
public class LazyTestDaoImpl implements LazyTestDao {

    public LazyTestDaoImpl() {
        System.out.println("Init LazyTestDaoImpl");
    }

    @Override
    public List<String> getTestStrings() {
        return Arrays.asList("Lazy1", "Lazy2");
    }
}
