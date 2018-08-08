/*
Project Name - Trip Planner
Developer - Rikhav Kothari
Description - This program was developed initially as class project for Microsoft's DEV276x,
Learn to Program With Java via Edx.org

 */

import java.nio.charset.MalformedInputException;
import java.sql.Time;
import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Greeting();
        TimeAndBudget();
        TimeDifference();
        CountrySize();
        System.out.println("\n\nThanks for using Vacation Planner!");
    }

    public static void Greeting() {
        System.out.println("Welcome to Vacation Planner");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you, "+name+". Where are you travelling to? ");
        String place = input.nextLine();
        System.out.print("Very cool. "+place+" sounds like an awesome trip.\n *********\n");
    }

    public static void TimeAndBudget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you planning on travelling for? ");
        int days = input.nextInt();
        System.out.print("How much money in USD are you planning on spending during your trip? ");
        int USD = input.nextInt();
        System.out.print("What is the three letter designation for the currency of your destination? ");
        String foreignCurrency = input.next();
        System.out.print("How many "+foreignCurrency+" to the USD? ");
        double exchangeRate = input.nextDouble();
        System.out.print("If you will travel for "+days+" days, that will that would be "+(days*24)+" days ");
        System.out.print("or "+(days*1440)+" minutes");
        System.out.print("\nIf you are going to spend $"+USD+" USD, that means ");
        System.out.print("per day you can spend up to $"+(USD/days)+" USD.");
        System.out.print("\nYour total budget in "+foreignCurrency+" is "+(USD*exchangeRate)+" "+foreignCurrency);
        System.out.print(", which per day is "+((USD*exchangeRate)/days)+" "+foreignCurrency+"\n *********\n");
    }

    public static void TimeDifference(){
        //Possible update - include data base of time zones to take GMT +/- as an input
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and destination? ");
        //System.out.print("\nNote: If you are any number of hours behind the destination, please enter a negative number.");
        int TimeDiff = input.nextInt();

        System.out.print("That means when it is midnight at home it will be "+(((24+TimeDiff)%24))+":00 at your destination");
        System.out.print("\nand when it is noon at home it will be "+((12+TimeDiff)%24)+":00");
        System.out.print("\n *********\n");

    }
    public static void CountrySize(){
        Scanner input = new Scanner((System.in));
        System.out.print("\nWhat is the square area of your destination in km2? ");
        int km2 = input.nextInt();
        double mi2 = km2*0.386102;
        double round1 = (mi2*100);
        int round2 = (int) round1;
        double mi2Rounded = round2/100.0;
        System.out.print("In mi2, that is "+mi2Rounded);


    }
}
