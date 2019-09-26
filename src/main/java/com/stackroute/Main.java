package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
        System.out.println("Config file loaded.");
        com.stackroute.domain.actor actor = (com.stackroute.domain.actor) factory.getBean("actor");
        com.stackroute.domain.movie movie1 = (com.stackroute.domain.movie) factory.getBean("movie1");
        System.out.println(movie1.getActor().getName());

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config file loaded.");
        com.stackroute.domain.movie movie2 = (com.stackroute.domain.movie)context.getBean("movie2");
        System.out.println(movie2.getActor().getName());
    }
}