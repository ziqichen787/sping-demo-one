package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    // create an array of string
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward",
            "Practice makes perfect"
    };

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        return data[index];
    }


}
