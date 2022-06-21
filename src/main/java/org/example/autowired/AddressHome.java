package org.example.autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressHome implements IAddress{
    private  String id;
    private  String city;
    private  String street;
    private  String house;
}
