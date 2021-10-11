package com.company;

import be.intecbrussel.Exercice;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.inheritedChannel;

public class Main {
    public static void main(String[] args) {
        // write your code here
        double start = 1;
        double end = 10;
        Scanner scan = new Scanner(in);
        System.out.println("enter value for the start");
        double value = scan.nextDouble();

        for (double i = start; i <= end; i++) {
            value = value + value * 10 / 100;
            System.out.println(value);

        }
        System.out.println("enter fee price");
        double transActie = scan.nextDouble();
        if (transActie > 5.0) {
            System.out.println(calcFee(transActie));
        } else {
            System.out.println(transActie);

        }
        System.out.println("enter year");
        Scanner scan1 = new Scanner(in);
        double year = scan1.nextDouble();
        if (year % 400 == 0) {
            System.out.println("leap year");
        } else {
            if (year % 4 == 0 && year % 100 != 0) {

                System.out.println("leap year");
            } else {
                System.out.println("not leap year");
            }
        }

//        there is a problem

        System.out.println("enter year again");
        double year2 = scan1.nextDouble();
        boolean four = (year2 % 4 == 0);
        boolean honderd = (year2 % 100 == 0);
        boolean fourhonderd = (year2 % 400 == 0);
        if (four || (!honderd && fourhonderd)) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }


    public static double calcFee(double x) {
        double a;
        a = x + x * 0.13;
        return a;
    }
}

