package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        GolfCoach theGolfCoach = context.getBean("myGolfCoach", GolfCoach.class);

        // call methods on the bean --> CricketCoach
        System.out.println("---------- This is for the CricketCoach class -----------");
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());


        // call our new methods to get the literal values --> CricketCoach
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // call methods on the bean --> GolfCoach
        System.out.println("---------- This is for the GolfCoach class -----------");
        System.out.println(theGolfCoach.getDailyWorkout());
        System.out.println(theGolfCoach.getDailyFortune());


        // close the context
        context.close();
    }
}
