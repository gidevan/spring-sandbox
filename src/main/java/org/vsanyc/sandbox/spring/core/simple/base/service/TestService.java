package org.vsanyc.sandbox.spring.core.simple.base.service;

import java.util.List;

public interface TestService {

    List<String> getTestStringValues();

    List<String> getDaoStrings();

    String getContextId();
}
