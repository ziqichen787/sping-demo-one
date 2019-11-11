package com.luv2code.springdemo;

public class GolfCoach implements Coach {

    private FortuneService fortuneService;

    public GolfCoach(FortuneService theFortuneService) {
        System.out.println("GolfCoach: inside no-arg constructor");
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Practice your putting skills for 2 hours today";
    }

    @Override
    public String getCoachName() {
        return "This coach's name is Johnson";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
