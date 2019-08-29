package org.vsanyc.sandbox.spring.core.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class PrototypeBean {
    public String getName() {
        return "PrototypeBean" + this.hashCode();
    }
}
