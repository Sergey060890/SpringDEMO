package org.example;

import org.example.annotation.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Person person = context.getBean("personAnnotation", Person.class);
        System.out.println(person);
//        SenderService service = context.getBean("serviceSender",SenderService.class);
//        service.send("my message");
////
//        ApplicationContext context2 = new ClassPathXmlApplicationContext("SpringConfig.xml");
//        SenderService service2 = context.getBean("serviceSender",SenderService.class);
//        service2.send("my message2");

//        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
//        CargoService service = context.getBean("cargoServiceMaz", CargoService.class);
//        service.send("чипсы");
//
//        ApplicationContext context2 = new ClassPathXmlApplicationContext("SpringConfig.xml");
//        CargoService service2 = context.getBean("cargoServiceGazel", CargoService.class);
//        service2.send("хлеб");




//        ConstructorBean constructorBean = context.getBean("constructorBean",ConstructorBean.class);
//        System.out.println(constructorBean.getName());
//        constructorBean.setName("Peter");
//
//        ConstructorBean constructorBean1 = context.getBean("constructorBean",ConstructorBean.class);
//        System.out.println(constructorBean1.getName());
//
//        ConstructorBean constructorBean1 = context.getBean("constructorBean", ConstructorBean.class);
//        System.out.println(constructorBean1.getName());
//        constructorBean1.getStringList().forEach(System.out::println);
//        constructorBean1.getMap().forEach((aLong, s) -> System.out.println(aLong + " " + s));


    }
}
