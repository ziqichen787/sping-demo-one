package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService forturnService;


    // define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        forturnService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {

        return "Spend 30 mins on batting practice";
    }

    @Override
    public String getCoachName() {
        return "Daniel";
    }


    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return forturnService.getFortune();
    }
}
