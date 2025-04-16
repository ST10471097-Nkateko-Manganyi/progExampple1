/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package waitersgr2;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class WaitersGR2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputDevice = new Scanner(System.in);
        double hours = 7.5;

        System.out.println("How many waiters are there?");
        int waiters = inputDevice.nextInt();

        int counter = 1;
        double OvrTips = 0;

        while(counter <= waiters) {
            System.out.println("How much did waiter" + counter + " get paid?");
            double tipsAmount = inputDevice.nextDouble();
            OvrTips += tipsAmount;
            counter = counter + 1;
        }

        double AvgTips = OvrTips / waiters;
        double AvgTipPerHour = AvgTips / hours;
        
        System.out.println("Average tips fo rthe day is: " + AvgTips);
        System.out.println("Average tips per hour is: " + AvgTipPerHour);

       
    }
}

        
         
       
    
    

