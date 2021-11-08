package exercise05_01;

public class WrapperApp {
    public static void main(String[] args) {


        int a = 5;
        Integer myInt = a;
        Integer myInte = 5;

        long mylong1 = a;
//    Long myLong2=a;
//    Long myLong2=myInt;

        Long myLong2 = mylong1;

        Long myLong = 45L;


        int intgr = 10;
        Integer objectInteger = 6;

        incrementInt(objectInteger);
        System.out.println(objectInteger);

        incrementInteger(objectInteger);
        System.out.println(objectInteger);

        incrementInt(intgr);
        System.out.println(intgr);

        incrementInteger(intgr);
        System.out.println(intgr);


    }

    private static void incrementInt(int a) {
       a++;
    }

    private static void incrementInteger(Integer a) {
        a++;
    }

}
