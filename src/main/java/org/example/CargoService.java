package org.example;

import org.aspectj.lang.annotation.Pointcut;

public class CargoService {

    private ICargo cargo;

    public CargoService() {

    }

    public CargoService(ICargo cargo) {
        this.cargo = cargo;
    }

    public void setCargo(ICargo cargo) {
        this.cargo = cargo;
    }

    public void send(String message) {
        cargo.move(message);
    }
}
