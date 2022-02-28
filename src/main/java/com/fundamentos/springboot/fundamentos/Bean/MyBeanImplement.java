package com.fundamentos.springboot.fundamentos.Bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hello from my own Bean implement");
    }
}
