package org.example;

import org.aspectj.lang.annotation.Pointcut;

public class GazelCargo implements ICargo{
    @Override

    public void move(String message) {
        System.out.println("Газель перевозит " + message);
    }
}
