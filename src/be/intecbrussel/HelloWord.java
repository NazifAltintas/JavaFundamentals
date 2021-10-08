package be.intecbrussel;

public class HelloWord {

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 3;
        int d = 7;
        int e = a + b - c * d;
        c = 5;
        b = c + d * a;
        a = 3;
        c = d + c;
        d = 9;
        a = b;
        c = e;
        e = c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
//Ask1   hetGrootste

//Ask2   positiefNegatif

//Ask3   weekDagen

//Age    age

//Method ageDrinking
        Exercice myExercice = new Exercice();
        myExercice.positiefNegatif();
    }
}
