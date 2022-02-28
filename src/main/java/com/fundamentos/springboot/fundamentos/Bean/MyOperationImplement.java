package com.fundamentos.springboot.fundamentos.Bean;

public class MyOperationImplement implements iMyOperation{
    @Override
    public int suma(int number) {
        return number+1;
    }
}
