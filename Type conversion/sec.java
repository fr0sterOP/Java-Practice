public class sec {
    public static void main(String[] args) {

        // 1. Implicit conversion
        // (byte to int)

        byte b = 24;
        int i;

        i = b;
        System.out.println("byte to int i = " + i); // 24

        // Char to int
        char c = 'a';
        int j;

        j = c;
        System.out.println("char to int j = " + j); // 97

        // 2. Explicit conversion
        // (int to byte)

        int k = 300;
        byte l;

        l = (byte) k;
        System.out.println("int to byte l = " + l); // 44

        // 3. Truncating conversion

        float f = 10.5f;
        int m;

        m = (int) f;
        System.out.println("float to int m = " + m); // 10

        // Boolean to any other type conversion is not allowed in Java

        byte b1 = 1;
        b1 = (byte) (b1 * 2);
        System.out.println("byte to byte b1 = " + b1); // 2

    }

}