/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.sleepapp;

import java.util.ArrayList;

/**
 *
 * @author ryanwhite
 */
public class SleepAnalyzer {

    private double averageSleep;

    public SleepAnalyzer() {

    }

    public void calcAvSleep(ArrayList<SleepInput> weeklySleep) {
        double total = 0;

        for (SleepInput s : weeklySleep) {
           total += s.getHours();
           averageSleep = total/7;
        }
    }
       
    

    public double getAverageSleep() {
        return averageSleep;
    }

}
