package org.example;

import java.util.Scanner;

public class ex23 {

    public static void main(String[] args) {

        // if else to determine if silent or not
        if (is_silent())
            // if else to determine if terminals corroded or not
            if (is_corroded())
                // print output to clean
                System.out.println("Clean terminals and try starting again.");
            else
                // print to replace cables
                System.out.println("Replace cables and try again.");
        else
            // if else to determine if slicking noise
            if (is_slick())
                // print to replace battery
                System.out.println("Replace the battery.");
            else
                // if else to determine if it cranks but doesn't start
                if (is_crank_no_start())
                    // print to check spark plugs
                    System.out.println("Check spark plug connections.");
                else
                    // if else to determine if it starts then dies
                    if (is_start_then_die())
                        // if else to determine if car has fuel injection
                        if (is_fuel_injection())
                            // prints to get it serviced
                            System.out.println("Get it in for service.");
                        else
                            // prints to check choke
                            System.out.println("Check to ensure the choke is opening and closing.");
                    else
                        // prints that is not possible
                        System.out.println("This should not be possible.");

    }

    // determines if car is silent
    public static boolean is_silent() {

        // prompts for input and returns scan converted to boolean type
        System.out.print("Is the car silent when you turn the key? ");
        Scanner input = new Scanner(System.in);
        return true_false(input.next());

    }

    // determines if terminals corroded
    public static boolean is_corroded() {

        // prompts for input and returns scan converted to boolean type
        System.out.print("Are the battery terminals corroded? ");
        Scanner input = new Scanner(System.in);
        return true_false(input.next());

    }

    // determines if there is a slicking noise
    public static boolean is_slick() {

        // prompts for input and returns scan converted to boolean type
        System.out.print("Does the car make a slicking noise? ");
        Scanner input = new Scanner(System.in);
        return true_false(input.next());

    }

    // determines if cranks but doesn't start
    public static boolean is_crank_no_start() {

        // prompts for input and returns scan converted to boolean type
        System.out.print("Does the car crank up but fail to start? ");
        Scanner input = new Scanner(System.in);
        return true_false(input.next());

    }

    // determines if it starts then dies
    public static boolean is_start_then_die() {

        // prompts for input then returns scan converted to boolean type
        System.out.print("Does the engine start and then die? ");
        Scanner input = new Scanner(System.in);
        return true_false(input.next());

    }

    // determines if car has fuel injection
    public static boolean is_fuel_injection() {

        // prompts for input then returns scan converted to boolean type
        System.out.print("Does you car have fuel injection? ");
        Scanner input = new Scanner(System.in);
        return true_false(input.next());

    }

    // converts input y or n into boolean type
    public static boolean true_false(String in) {

        // if else to determine if input is y, n, or other
        if (in.equals("y"))
            // returns true if y
            return true;
        else if (in.equals("n"))
            // returns false if n
            return false;
        else
            // exits program if not y or n
            System.exit(0);
            return false;
    }
}
