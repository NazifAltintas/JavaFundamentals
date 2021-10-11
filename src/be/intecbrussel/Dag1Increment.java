package be.intecbrussel;

public class Dag1Increment {
    public static void main(String[] args) {

        int a = 5;
        a++;
        System.out.println(a++);

        int b = 10;
        boolean test = false;
        if (b <= 11 || (test = b <= 15)) ;
        System.out.println(test);

        int d = 47;
        if (!(d < 10)) {
            System.out.println("condition is true");
        }

        int e = 10;
        int f;
        if (e > 5) {
            f = 1;
        } else {
            f = 0;
        }
        f = e > 0 ? e : f;
        System.out.println(f);
    }

}
