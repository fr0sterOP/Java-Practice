package Operators;

public class bitwise {
    public static void main(String[] args) {
        int a = 2; // 00000000 00000000 00000000 00000010 in binary
        int b = 3; // 00000000 00000000 00000000 00000011 in binary

        int c = a & b; // 00000000 00000000 00000000 00000010 in binary (2 in decimal)
        int d = a | b; // 00000000 00000000 00000000 00000011 in binary (3 in decimal)
        int e = a ^ b; // 00000000 00000000 00000000 00000001 in binary (1 in decimal)
        int f = ~a; // 11111111 11111111 11111111 11111101 in binary (-3 in decimal)

        System.out.println(c + " , " + d + " , " + e + " , " + f); // Output: 2 , 3 , 1 , -3

        // Shift operators
        int g = a << 1; // 00000000 00000000 00000000 00000100 in binary (4 in decimal)
        int h = a >> 1; // 00000000 00000000 00000000 00000001 in binary (1 in decimal)
        int i = a >>> 1; // 00000000 00000000 00000000 00000001 in binary (1 in decimal)
        System.out.println(g + " , " + h + " , " + i); // Output: 4 , 1 , 1
    }
}