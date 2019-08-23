package org.vsanyc.sandbox.spring.core.simple.base.dao;

import java.util.List;

public interface TestDao {

    List<String> getTestStrings();

    String getContextId();
}
