package com.springkafka.kafka.models;

public class Welcome {
    String country;
    String randomMessage;

    public Welcome() {
    }

    public Welcome(String country, String randomMessage) {
        this.country = country;
        this.randomMessage = randomMessage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRandomMessage() {
        return randomMessage;
    }

    public void setRandomMessage(String randomMessage) {
        this.randomMessage = randomMessage;
    }

    @Override
    public String toString() {
        return "Welcome{" +
                "country='" + country + '\'' +
                ", randomMessage='" + randomMessage + '\'' +
                '}';
    }
}
