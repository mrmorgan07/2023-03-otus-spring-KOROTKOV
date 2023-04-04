package ru.mskorotkov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.mskorotkov.spring.service.ResourceLoaderService;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        ResourceLoaderService loader = (ResourceLoaderService) context.getBean("resourceLoaderService");
        try {
            loader.readResource();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
