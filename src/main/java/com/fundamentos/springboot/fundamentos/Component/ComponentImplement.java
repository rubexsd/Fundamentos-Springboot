package com.fundamentos.springboot.fundamentos.Component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependecy{
    @Override
    public void saludar() {
        System.out.println("Hello world from component");
    }
}
