package org.example;

public class EmailSender implements ISender {
    private String address;

    @Override
    public void send(String message) {
        System.out.println("email send: " + message);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
