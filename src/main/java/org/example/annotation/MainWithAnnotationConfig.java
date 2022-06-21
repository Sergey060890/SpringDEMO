package org.example.annotation;

import lombok.Getter;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

//@Component
//@Getter
//@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MainWithAnnotationConfig implements BeanNameAware {
//    private String beamName;

    public static void main(String[] args) {
//        ApplicationContext ctx =
//                new AnnotationConfigApplicationContext(MainWithAnnotationConfig.class);
//        MainWithAnnotationConfig bean = ctx.getBean(MainWithAnnotationConfig.class);
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext("org.example.annotation");
        Person person = ctx.getBean("personAnnotation",Person.class);
        System.out.println(person);
//        System.out.println(bean.getBeamName());
//        System.out.println(bean.getClass());

    }

    @Override
    public void setBeanName(String s) {
//        beamName = s;
    }
}
