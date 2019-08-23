package org.vsanyc.sandbox.spring.core.simple.base.dao;

import org.springframework.stereotype.Repository;
import org.vsanyc.sandbox.spring.core.simple.base.annotation.ContextIdAnnotation;

import java.util.Arrays;
import java.util.List;

@Repository
@ContextIdAnnotation(value = "testDaoAnnotationValue")
public class TestDaoImpl implements TestDao {

    private String contextId;

    @Override
    public List<String> getTestStrings() {
        return Arrays.asList("DaoString1", "DaoString2", "DaoString3");
    }

    @Override
    public String getContextId() {
        return contextId;
    }
}
