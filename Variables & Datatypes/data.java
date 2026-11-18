
public class data {
    public static void main(String[] args) {

        // Integer variable

        // byte myByte = 100;
        // byte myByte = 0b100; // Binary literal for 4
        // byte myByte = 03; // Octal literal for 3
        byte myByte = 0xA; // Hexadecimal literal for 10

        short myShort = 10000;
        int myInt = 25;
        long myLong = 100000L;

        // Real number variable
        float myFloat = 5.75f; // single precision floating point number
        // double myDouble = 19.99d; // double precision -> Standard way

        double myDouble = 6.02e23; // Scientific notation for 6.02 * 10^23

        // Character variable
        char myChar = 'B';

        // Boolean variable
        boolean myBoolean = true;

        System.out.println("Byte value: " + myByte + ", Short value: " + myShort + ", Integer value: " + myInt
                + ", Long value: " + myLong);

        System.out.println("Float value: " + myFloat + ", Double value: " + myDouble);

        System.out.println("Character value: " + myChar);

        System.out.println("Boolean value: " + myBoolean);
    }
}
