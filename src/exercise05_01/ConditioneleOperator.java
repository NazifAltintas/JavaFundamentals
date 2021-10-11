package exercise05_01;

public class ConditioneleOperator {
    public static void main(String[] args) {
        int num1=57;
        int num2=33;
        int num3=-65;
        System.out.println(num1 < num2 ? num1 : num2);
        System.out.println(num1 < num3 ? num1 : num3);
        System.out.println(num2 < num1 ? num2 : num1);
        System.out.println(num2 < num3 ? num2 : num3);
        System.out.println(num3 < num1 ? num3 : num1);
        System.out.println(num3 < num2 ? num3 : num2);
    }

}

    