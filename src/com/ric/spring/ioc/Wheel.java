package com.ric.spring.ioc;

public class Wheel {
    private String brand;
    private String specification ;

    @Override
    public String toString() {
        return "wheel: brand: "+brand+"; specification: "+specification;
    }
}
