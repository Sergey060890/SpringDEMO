package org.example.annotation;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.autowired.IAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@Component("personAnnotation")
public class Person {
    @Value("#{'1'}")
    private  String id;
    @Value("#{'Egor'}")
    private  String name;
    @Value("#{'Petrov'}")
    private  String surname;
    @Value("#{addressAnnotation}")
    private IAddress address;

}
