package com.springkafka.kafka.models;

public class Gretting {
    String name;
    String message;

    public Gretting() {
    }

    public Gretting(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Gretting{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
