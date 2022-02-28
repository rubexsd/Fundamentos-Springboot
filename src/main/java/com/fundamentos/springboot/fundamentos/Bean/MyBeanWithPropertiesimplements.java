package com.fundamentos.springboot.fundamentos.Bean;

public class MyBeanWithPropertiesimplements implements  iMyBeanWithProperties{
    private String name;
    private String lastname;

    public MyBeanWithPropertiesimplements(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String function() {
        return name + " - " +lastname;
    }
}
