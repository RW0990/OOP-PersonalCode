/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.sleepapp;

import java.util.ArrayList;
import java.util.Iterator;
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
        
        for(SleepInput s:weeklySleep){
            double bedTime = s.getBedTime();
            double wakeUpTime = s.getWakeUpTime();
            double hours;
            
            if(wakeUpTime < bedTime){
                hours=(24 - bedTime)+wakeUpTime;
            }else{
                hours=wakeUpTime - bedTime;
            }
            total += hours;
        }
        if(!weeklySleep.isEmpty()){
            averageSleep = total/weeklySleep.size();
        }else{
            averageSleep=0;
        }
    }
    public double getAverageSleep(){
        return averageSleep;
    }
        
    }