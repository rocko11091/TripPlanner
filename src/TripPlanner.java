/*
Project Name

 */

import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Greeting();
        TimeAndBudget();
        //TimeDifference();
        //CountrySize();
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
        System.out.print(", which per day is "+((USD*exchangeRate)/days)+" "+foreignCurrency);


    }

}
