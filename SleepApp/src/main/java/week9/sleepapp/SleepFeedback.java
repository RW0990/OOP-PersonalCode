/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.sleepapp;

/**
 *
 * @author ryanwhite
 */
public class SleepFeedback {

    private final String feedback;

    public SleepFeedback(SleepAnalyzer analyzer) {
        double avg = analyzer.getAverageSleep();
        
        //creating feedback for the user based on hours of sleep
        if (avg > 7) {
            feedback = "Your average sleep duration is good";
        } else if (avg > 9) {
            feedback = "Your average sleep is unhealthy sleeping over 9 hours a night can lead to health problems";
        } else {
            feedback = "Your average sleep is poor, try going to bed at a reasonable time";
        }
    }

    public String getFeedback() {
        return feedback;
    }
}
