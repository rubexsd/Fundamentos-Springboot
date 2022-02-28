package com.fundamentos.springboot.fundamentos.Configuration;

import com.fundamentos.springboot.fundamentos.Bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplementTwo();
    }
    @Bean
    public iMyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }
    @Bean
    public iMyBeanWithDependencia beanOperationOperationWithDependency(iMyOperation iop){
        return new MyBeanWithDependencyImplement(iop);
    }
    @Bean
    public IthreethImplement implementThree(){
        return new ThreeImplement();
    }
}
