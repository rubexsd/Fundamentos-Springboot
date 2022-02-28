package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.Bean.IthreethImplement;
import com.fundamentos.springboot.fundamentos.Bean.MyBean;
import com.fundamentos.springboot.fundamentos.Bean.iMyBeanWithDependencia;
import com.fundamentos.springboot.fundamentos.Bean.iMyBeanWithProperties;
import com.fundamentos.springboot.fundamentos.Component.ComponentDependecy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependecy componentDependecy;

	private MyBean myBean;
	private iMyBeanWithDependencia imyBeanWithDependencia;
	private IthreethImplement ithreethImplement;
	private iMyBeanWithProperties iMybeanWithproperties;


	public FundamentosApplication(ComponentDependecy componentDependecy, MyBean myBean, iMyBeanWithDependencia imyBeanWithDependencia, IthreethImplement ithreethImplement, iMyBeanWithProperties iMybeanWithproperties) {
		this.componentDependecy = componentDependecy;
		this.myBean = myBean;
		this.imyBeanWithDependencia = imyBeanWithDependencia;
		this.ithreethImplement = ithreethImplement;
		this.iMybeanWithproperties = iMybeanWithproperties;
	}

	public static void main(String[] args) {

		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependecy.saludar();
		myBean.print();
		imyBeanWithDependencia.printWithDependecy();
		ithreethImplement.hello();
		System.out.println(iMybeanWithproperties.function());
	}
}
