package com.ric.spring.ioc;

import org.junit.jupiter.api.Test;

public class SimpleIOCTest {
    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getResource("spring-ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel)bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car)bf.getBean("car");
        System.out.println(car);
    }
}
