package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean {
    @PostConstruct
    public void init(){
        System.out.println("run new");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("end");
    }

    public void show(){
        System.out.println("Cô Loan Xinh Gái =))");
    }
}
