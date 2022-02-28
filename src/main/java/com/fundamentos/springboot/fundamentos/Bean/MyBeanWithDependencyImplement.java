package com.fundamentos.springboot.fundamentos.Bean;

public class MyBeanWithDependencyImplement implements iMyBeanWithDependencia{


    private iMyOperation imyOperation;

    public MyBeanWithDependencyImplement(iMyOperation imyOperation) {
        this.imyOperation = imyOperation;
    }

    @Override
    public void printWithDependecy() {
        int numer = 3;
        System.out.println(imyOperation.suma(numer));
        System.out.println("Hela desde laq implementacion de un bean con dependencia");
    }
}
