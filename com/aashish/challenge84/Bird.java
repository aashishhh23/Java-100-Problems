package com.aashish.challenge84;

public abstract class Bird implements Flyable {

    private final String breed;

    protected Bird(String breed) {
        this.breed = breed;
    }

    // to access :- generate getter

    public String getBreed() {
        return breed;
    }
}
