package be.intecbrussel;

import java.util.Scanner;

public class Exercice {
    public void ageDrinking() {

        int age = 19;
        if (age > 18) {
            System.out.println("you are a kind");
        } else if (age > 3) {
            System.out.println("you are a kind");
        } else {
            System.out.println("you are a baby");
        }


    }

    public void hetGrootste() {
        System.out.println("Method secondExercice");
        System.out.println("enter 3 number");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int grootest = num1;
        if (num2 > grootest) {
            grootest = num2;
        }
        if (num3 > grootest) {
            grootest = num3;
        }
        System.out.println(grootest + " is grootste");
    }

    public void positiefNegatif() {
        System.out.println("enter number");
        Scanner scan2 = new Scanner(System.in);
        int num = scan2.nextInt();
        if (num > 0) {
            System.out.println("positief");
        } else if (num < 0) {
            System.out.println("negatief");
        } else {
            System.out.println(0);
        }
    }

    public void age() {
        System.out.println("enter your age");
        Scanner scan4 = new Scanner(System.in);
        int age = scan4.nextInt();
        if (age > 120 || age < 0) {
            System.out.println("invalid");
        } else if (age > 18) {
            System.out.println("you are an adult");
        } else if (age > 3) {
            System.out.println("you are a kind");
        } else {
            System.out.println("you are a baby");
        }

    }

    public void weekDagen() {
        System.out.println("enter number between 1-7");
        Scanner scan3 = new Scanner(System.in);
        int day = scan3.nextInt();
        if (day == 1) {
            System.out.println("maandag");
        } else if (day == 2) {
            System.out.println("dinsdag");
        } else if (day == 3) {
            System.out.println("woensdag");
        } else if (day == 4) {
            System.out.println("donderdag");
        } else if (day == 5) {
            System.out.println("vrijdag");
        } else if (day == 6) {
            System.out.println("zaterdag");
        } else if (day == 7) {
            System.out.println("zondag");
        } else {
            System.out.println("invalid");
        }
    }
}

