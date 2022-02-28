package com.fundamentos.springboot.fundamentos.Component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ComponentTwoImplement implements ComponentDependecy{
    @Override
    public void saludar() {
        System.out.println("Hello world from second component");
    }
}
