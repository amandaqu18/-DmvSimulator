package com.company;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();

        int place = rand.nextInt(200);
        int clicker = place;

        System.out.println("Take your number " + clicker + " and join the line.");

        while(true){
            clicker++;
            if(clicker > 200){
                clicker = 1;
            }
            System.out.println("I am now serving number " + clicker);
            System.out.println("I am sorry but you do not have the right documents for the license.");

            if(clicker == place){
                break;
            }


        }
        System.out.println("Please step forward to be served " + place);
    }
}