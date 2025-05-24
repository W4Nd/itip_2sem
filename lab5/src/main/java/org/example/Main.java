package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MonsterParty xmlParty = xmlContext.getBean("monsterParty", MonsterParty.class);
        xmlParty.showMonster();
        xmlContext.close();
    }
}