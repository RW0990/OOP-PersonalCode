/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package week9.sleepapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ryanwhite
 */
public class SleepApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<SleepInput> weeklySleep = new ArrayList<>();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Hi there welcome to your average sleep calculator!");
        System.out.println("The average person sleeps between 49 and 63 hours per week");
        System.out.println("Please enter your bed times in 24 hour format");
        System.out.println("For example: -> 20.5 = 8:30pm, 24 -> 12 o'clock");
        for (String day : days) {

            System.out.println("Enter the time you went to bed on " + day);
            double bedTime = input.nextDouble();

            System.out.println("Enter the time you woke up the next morning (in 24 hour format -> 20.5 = 8:30pm)");
            double wakeUpTime = input.nextDouble();

            SleepInput sleep = new SleepInput(bedTime, wakeUpTime);
            weeklySleep.add(sleep);
        }

        for (int i = 0; i < weeklySleep.size(); i++) {
            System.out.println(days[i] + ": " + weeklySleep.get(i).getHours() + " hours");
        }

        //analyzer to calculate average sleep
        SleepAnalyzer analyzer = new SleepAnalyzer();
        analyzer.calcAvSleep(weeklySleep);

        //get feedback for user on sleep duration
        SleepFeedback feedback = new SleepFeedback(analyzer);

        System.out.println("Your total average sleep for this week is " + analyzer.getAverageSleep() + " hours");
        System.out.println(feedback.getFeedback());

    }
}
