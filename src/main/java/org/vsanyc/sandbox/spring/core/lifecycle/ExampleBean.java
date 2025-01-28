package org.vsanyc.sandbox.spring.core.lifecycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * Created by vano on 26.8.19.
 */
@Component(ExampleConstants.EXAMPLE_BEAN_NAME)
public class ExampleBean implements Lifecycle, InitializingBean {

    @PostConstruct
    public void postConstruct2() {
        System.out.println("Example bean post construct2");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Example bean post construct");
    }

    @PostConstruct
    public void postConstruct1() {
        System.out.println("Example bean post construct1");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Example bean pre destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Example bean after properties set(InitializingBean implementation)...");
    }

    @Override
    public void start() {
        System.out.println("ExampleBean.start()");
    }

    @Override
    public void stop() {
        System.out.println("ExampleBean.stop()");
    }

    @Override
    public boolean isRunning() {
        System.out.println("ExampleBean.isRunning()");
        return false;
    }

    public String getBeanData() {
        System.out.println("ExampleBean.getBeanData");
        return "BeanData";
    }
}
