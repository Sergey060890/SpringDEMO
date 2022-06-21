package org.example.autowired;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@NoArgsConstructor
@Data
public class Person {
    private  String id;
    private  String name;
    private  String surname;
    private  IAddress address;

//    @Value("#{address22}")
//    private  IAddress address;

//    @Autowired (required = false)
//    private  Address address;
//
//    @Autowired
//    private  Address address;

//    @Autowired
//    public Person(@Qualifier("address") IAddress address) {
//        this.address = address;
//    }

//    @Autowired
//    public Person(@AddressAnnotation IAddress address) {
//        this.address = address;
//    }
}
