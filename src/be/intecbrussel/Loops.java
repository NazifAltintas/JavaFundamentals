package be.intecbrussel;

//Print alle getallen van 1 tot en met 10.

public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//Vraag een getal aan de gebruiker. Print alle veelvouden van dat getal tot 10

        int num = 45;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * num);
        }

/*
  Gebruik een do-while loop.
  Vraag 2 getallen aan de gebruiker. Print de som van de getallen.
  Vraag aan de gebruiker of hij opnieuw de vorige operatie wil toepassen.
  Zolang hij ja antwoord, vraag je opnieuw 2 getallen enzovoort.
*/
        System.out.println("Enter two numbers");
        String ans;
        do {
            int num1 = 56;
            int num2 = 14;
            System.out.println(num1 + num2);
            System.out.println("Do you want to continue: Yes or No");
            ans = "No";
        } while (ans == "Yes");
    }
}
