/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.sleepapp;

/**
 *
 * @author ryanwhite
 */
public class SleepInput extends SleepApp {

    private double bedTime;
    private double wakeUpTime;


    public SleepInput(double bedTime, double wakeUpTime) {
        this.bedTime = bedTime;
        this.wakeUpTime = wakeUpTime;
    }

    public double getBedTime() {
        return bedTime;
    }

    public double getWakeUpTime() {
        return wakeUpTime;
    }
    
    public double getHours(){
        if(wakeUpTime < bedTime){
            return(24 - bedTime)+wakeUpTime;
        }else{
            return wakeUpTime - bedTime;
        }
    }

}
