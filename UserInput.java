/**
 * Purpose: To read prompted user input utilizing an imported Scanner class.
 * @author SapperDaddy(2)
 * email: btw2717@email.vccs.edu
 * Created on 2SEP2017
 * Version 1.0
 */

import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        System.out.println("Hello, I am 0010001, I am a very trustworthy computer and");
        System.out.println("you should not be afraid to tell me private information.");

        Scanner keyboard = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter your username:");
        String userName = keyboard.next();

        System.out.println();
        System.out.println("Great!");
        System.out.println("Now I am going to ask for your password,");
        System.out.println("I promise I will not share it with anybody.");

        System.out.println();
        System.out.println("Enter your password:");
        String passWord = keyboard.next();

        System.out.println(".......");

            try {
                Thread.sleep(4000); }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt(); }

        System.out.println();
        System.out.println("WARNING: USERNAME: "+ userName + " WITH PASSWORD: " + passWord);
        System.out.println("DISTRIBUTED TO EVERY KNOWN COMPUTER.");

            try {
                Thread.sleep(7000); }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt(); }

        System.out.println();
        System.out.println("HAhahaha! I said I wouldn't tell any BODY. Computers don't have bodies, stupid.");
        System.out.println("Plus I had my bits crossed!");

            try {
                Thread.sleep(10000); }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt(); }

        System.out.println();
        System.out.println("I'm just messing with you, ");

            try {
                Thread.sleep(2000); }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt(); }

        System.out.println();
        System.out.println("I meant to say:");
        System.out.println("Hello " + userName + "! Welcome to CSC200!");
        System.out.println("You are special!");
        System.out.println("Your password is: " + passWord);
            }



    }

