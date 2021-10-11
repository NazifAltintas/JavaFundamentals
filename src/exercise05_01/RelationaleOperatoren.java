package exercise05_01;

public class RelationaleOperatoren {
    public static void main(String[] args) {
        int a=45;
        int b=7_8;
        boolean c=a>b;
        System.out.println(c);
        boolean c1=a>=b;
        System.out.println(c1);
        boolean c2=a<b;
        System.out.println(c2);
        boolean c3=a<=b;
        System.out.println(c3);
        boolean c4=a==b;
        System.out.println(c4);
        boolean c5=a!=b;
        System.out.println(c5);
        System.out.println();
        boolean value1=true;
        boolean value2=false;
        System.out.println(value1&&value2);
        System.out.println(value1||value2);
        System.out.println(!value1);
        System.out.println(!value2);
    }
}
