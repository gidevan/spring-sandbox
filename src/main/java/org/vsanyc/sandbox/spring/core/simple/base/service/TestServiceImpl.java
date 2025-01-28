package org.vsanyc.sandbox.spring.core.simple.base.service;

import org.springframework.stereotype.Service;
import org.vsanyc.sandbox.spring.core.simple.base.annotation.ContextIdAnnotation;
import org.vsanyc.sandbox.spring.core.simple.base.dao.TestDao;

import java.util.Arrays;
import java.util.List;
import jakarta.annotation.PostConstruct;

@Service
@ContextIdAnnotation(value = "testServiceAnnotationValue")
public class TestServiceImpl implements TestService {

    private TestDao testDao;

    private String contextId;

    @PostConstruct
    protected void postConstruct() {
        System.out.println("TestService post construct");
    }

    public TestServiceImpl(TestDao testDao) {
        System.out.println("Init TestService bean...");
        this.testDao = testDao;
    }

    @Override
    public List<String> getTestStringValues() {
        return Arrays.asList("String1", "String2");
    }

    @Override
    public List<String> getDaoStrings() {
        return testDao.getTestStrings();
    }

    @Override
    public String getContextId() {
        return contextId;
    }
}
