package com.ric.spring.aop;

import org.junit.jupiter.api.Test;

public class SimpleAOPTest {

    @Test
    public void getProxy() {
        MethodInvocation logTask = () -> System.out.println("log task start");
        HelloServiceImpl helloService = new HelloServiceImpl();

        Advice beforeAdive = new BeforeAdvice(helloService,logTask);

        HelloService helloServiceProxy = (HelloService) SimpleAOP.getProxy(helloService, beforeAdive);
        helloServiceProxy.sayHello();
    }

}
