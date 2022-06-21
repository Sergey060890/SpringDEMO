package org.example;

public class MazCargo implements ICargo{
    @Override
    public void move(String message) {
        System.out.println("Маз перевозит " + message);
    }
}
