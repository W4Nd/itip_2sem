package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext contextXml = 
            new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Home homeWithDishwasher = contextXml.getBean("homeBean", Home.class);
        homeWithDishwasher.showApplianceInfo();

        contextXml.close();
    }
}
