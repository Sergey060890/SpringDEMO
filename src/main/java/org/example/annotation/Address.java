package org.example.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.autowired.IAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Component("addressAnnotation")
public class Address implements IAddress {
    @Value("#{'1'}")
    private  String id;
    @Value("#{'London'}")
    private  String city;
    @Value("#{'Stamford'}")
    private  String street;
    @Value("#{'12'}")
    private  String house;

}
