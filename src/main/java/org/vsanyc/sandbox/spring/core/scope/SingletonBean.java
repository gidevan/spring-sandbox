package org.vsanyc.sandbox.spring.core.scope;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public String getName() {
        return "SingletonBean" + this.hashCode();
    }
}
