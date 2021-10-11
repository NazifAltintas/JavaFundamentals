package be.intecbrussel;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
/*
 Schrijf een programma dat de straal en lengte van een cilinder leest en het gebied
 en volumeberekent met behulp van de volgende formules:
 area = radius * radius * pvolume = area * length
*/
        System.out.println("Enter radius");
        Scanner myRadius = new Scanner(System.in);
        double raduis = myRadius.nextDouble();
        System.out.println("Enter length");
        Scanner myLength = new Scanner(System.in);
        double length = myRadius.nextDouble();
        double p = 3.14;
        double area = raduis * raduis * p;
        double volume = area * length;
        System.out.println(area);
        System.out.println(volume);


/*
  Schrijf een programma dat een geheel getal tussen 0 en 1000 leest en voegt alle cijfers in hetgehele getal toe.
  Bijvoorbeeld, als een integer is 932, de som van alle cijfers is 14.
  Tip: gebruik de % -operator om cijfers er uit te halen en gebruik de operator / om hetuitgehaalde cijfer te verwijderen.
  Bijvoorbeeld 932% 10 = 2 en 932/10 = 93.
*/
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;

        while (a != 0) {
            sum = a % 10 + sum;
            a = a / 10;

        }
        System.out.println(sum);
/*
Schrijf een programma dat de gebruiker vraagt een geheelgetal in te voeren
 en bepaalt of het deelbaar is door 5 en 6, of het deelbaar is door 5 of 6.
*/
        System.out.println("Enter number");
        Scanner deeelbaar = new Scanner(System.in);
        int b = deeelbaar.nextInt();
        if (b % 5 == 0 && b % 6 == 0) {
            System.out.println("deelbaar 5 en 6");
        } else if (b % 5 == 0) {
            System.out.println("deelbaar 5");
        } else if (b % 6 == 0) {
            System.out.println("deelbaar 6");
        } else {
            System.out.println("niet deelbaar 5 of 6");
        }
/*
 Stel dat u rijst koopt in twee verschillende verpakkingen.
 U wilt een programma schrijven omde kosten te vergelijken.
 Het programma vraagt de gebruiker om het gewicht en de prijs vanelk pakket in te voeren
 en toont het pakket met de betere prijs.
*/
        System.out.println("Enter weight of first product");
        Scanner myWeight = new Scanner(System.in);
        double weight = myWeight.nextDouble();
        System.out.println("Enter prijs of first product");
        Scanner myPrijs = new Scanner(System.in);
        double prijs = myPrijs.nextInt();
        System.out.println("Enter weight of second product");
        Scanner myWeightSecond = new Scanner(System.in);
        double weight2 = myWeightSecond.nextDouble();
        System.out.println("Enter prijs of second product");
        Scanner myPrijsSecond = new Scanner(System.in);
        double prijs2 = myPrijsSecond.nextInt();
        if (weight / prijs > weight2 / prijs2) {
            System.out.println("first product cheap");
        } else if (weight / prijs < weight2 / prijs2) {
            System.out.println("second product cheap");
        } else {
            System.out.println("same price");
        }
//  Schrijf een programma die de sum bereken van de eerste 100 natuurlijke getallen.

        int sum1 = 0;
        for (int i = 0; i < 100; i++) {
            sum1 = sum1 + i;
        }
        System.out.println(sum1);

//    Schrijf een programma die de som van alle priemgetallen van 20 tot en met 100 gaat berekenen.

        int count = 1;
        int j;
        for (j = 20; j <= 100; j++) {
            int cont = 0;
            for (int k = 2; k < j; k++) {
                if (j % k == 0) {
                    cont = 1;
                    break;
                }
            }
            if (cont == 0) {
                System.out.println(count + ") " + j);
                count++;
            }

        }

    }
}
