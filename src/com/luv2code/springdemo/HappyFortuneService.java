package com.luv2code.springdemo;

import java.util.ArrayList; // import the ArrayList class
import java.util.Random;


public class HappyFortuneService implements FortuneService {


    @Override
    public String getFortune() {
        ArrayList<String> fortunes = new ArrayList<>();

        fortunes.add("All your dreams will come true one day!");
        fortunes.add("Today is your lucky day!");
        fortunes.add("Everything will be better for you!");

        int size;
        Random rand = new Random();
        size = fortunes.size();
        int rand_index = rand.nextInt(size);


        return fortunes.get(rand_index);
    }
}
