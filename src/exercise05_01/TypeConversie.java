package exercise05_01;

public class TypeConversie {

    public static void main(String[] args) {
        boolean aBoolean = false;    // variable types: var
        char aCharacter = 'd';
        byte aByte = 124;
        short aShortInteger = 115; // probeer voor deze variable 0342 -octaal    0x78b 0x54_4   0x78 -  hexadecimaal 0b101100111 binair
        int anInteger = 67;
        long aLongInteger = 45631341L;
        float aDecimalnumber = 1256.32F;
        double aBigDecimalNumber = 12.365987451236;

        final double PI=3.14;

        // PI=3.15; Cannot assign again a value to final variable 'PI'

       // aByte=aShortInteger; not possiable

        aByte=(byte) aShortInteger;
        System.out.println(aByte);
        aShortInteger=(short) aCharacter;
        aByte=(byte) aCharacter;
        System.out.println(aShortInteger);
        System.out.println(aByte);
        aCharacter=(char) anInteger;
        System.out.println(aCharacter);

        for (int i=0;i<200;i++) {
            char a=(char) i;
            System.out.println(a);
        }
        char b='※';
        int a=b;
        System.out.println(a);







    }
}
