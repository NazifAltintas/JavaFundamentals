package exercise05_01;

import java.util.*;

public class RekenkundigeOperatoren {
    public static void main(String[] args) {

        System.out.println("The sum of 3+8=" + (3 + 8));

        System.out.println("Enter integer");
        Scanner keyboard = new Scanner(System.in);

        int intValue = keyboard.nextInt();
        System.out.println(intValue);

        System.out.println("enter 2 integer");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);

        int verschil = num1 - num2;
        System.out.println(verschil);

        int pruduct = num1 * num2;
        System.out.println(pruduct);

        int deiling = num1 / num2;
        System.out.println(deiling);

        num1++;
        ++num1;
        num2--;
        --num2;

        System.out.println(num1);
        System.out.println(num2);

            char chr1='a';
        System.out.println(chr1);
        System.out.println("enter 2 number");

        byte say1= keyboard.nextByte();
        byte say2 = keyboard.nextByte();

        byte som= (byte) (say1*say2);
        System.out.println(som);

        int z=2111111155;
        int y=2111111111;
        long x=(long) z*y;
        System.out.println(x);


        keyboard.close();
    }
}
