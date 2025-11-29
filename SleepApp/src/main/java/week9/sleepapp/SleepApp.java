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
        
        //creating an arraylist of the days of the week
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Hi there welcome to your average sleep calculator!");
        System.out.println("The average person sleeps between 49 and 63 hours per week");

        for (String day : days) {
            int hours;
            while (true) {
                System.out.println("Please enter the amount of hours you slept on " + day + ":");
                if (input.hasNextInt()) {
                    hours = input.nextInt();
                    break;
                } else {
                    System.out.println("Please enter a valid number eg.1,2,3,...");
                    input.nextInt();
                }
            }

            SleepInput sleep = new SleepInput(hours);
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
