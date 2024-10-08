/*Problem Statement
        Particulate matters are the biggest contributors to Delhi pollution. The main reason behind
        the increase in the concentration of PMs include vehicle emission by applying Odd Even
        concept for all types of vehicles. The vehicles with the odd last digit in the registration
        number will be allowed on roads on odd dates and those with even last digit will on even
        dates.
        Given an integer array a[], contains the last digit of the registration number of N vehicles
        traveling on date D(a positive integer). The task is to calculate the total fine collected by the
        traffic police department from the vehicles violating the rules.*/

import java.util.Scanner;
public class Problem5 {
    //METHOD TO CALCULATE TOTAL FINE ON VEHICLES ON THE BASIS OF ODD EVEN CONCEPT
    static void calculateTotalFine(int vehicles[], int date){
        int totalFine=0;        //INITIALISING TOTAL FINE WITH ZERO
        for(int i=0; i<vehicles.length; i++){
            if(date%2==0){
                if(vehicles[i]%2==1){
                    totalFine+=500;     //IF THE DATE IS EVEN AND VEHICLE'S REGISTRATION NUMBER IS ODD, THEN FINE IS CHARGED
                }
            }
            else if(date%2==1) {
                if (vehicles[i] % 2 == 0) {
                    totalFine += 500;       //IF THE DATE IS ODD AND VEHICLE'S REGISTRATION NUMBER IS EVEN, THEN FINE IS CHARGED
                }
            }
        }
        //PRINTING TOTAL FINE
        System.out.println("Total Fine= " + totalFine);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //INPUT THE NUMBER OF VEHICLES
        System.out.print("Enter no. of vehicles: ");
        int n= sc.nextInt();

        //INPUT LAST DIGIT OF REGISTRATION NUMBER OF VEHICLES IN AN ARRAY
        int vehicles[]= new int[n];
        System.out.print("Enter the last digit of " + n + " vehicles: ");
        for(int i=0; i<n; i++){
            vehicles[i]= sc.nextInt();
        }

        //INPUT DATE TO CHECK FINE ON VEHICLES
        System.out.print("Enter the date(1-31): ");
        int d=sc.nextInt();
        boolean date=true;
        if(d<1 || d>31){
            date=false;     //IF DATE IS NOT BETWEEN 1 AND 31, THEN THE DATE IS INVALID
        }
        if(date==true){
            calculateTotalFine(vehicles, d);
        }
        else{
            System.out.println("Invalid date");
        }

    }
}
