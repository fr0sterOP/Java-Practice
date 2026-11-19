package Operators;

public class arithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = a + b; // 15
        int d = a - b; // -5
        int e = a * b; // 50
        int f = b / a; // 2
        int g = b % a; // 0

        System.out.println(c + " ,  " + d + " , " + e + " , " + f + " , " + g);

        int h = a + 2;
        // h = h + 2; //since this is ok in CSE

        h += 5; // h = h + 5 // h = 12
        h -= 3; // h = h - 3 // h = 9
        h *= 2; // h = h * 2 // h = 18
        h /= 4; // h = h / 4 // h = 4
        System.out.println(h);

        int x = 5;

        x++; // x = x + 1 // x = 6
        System.out.println(x);

        x--; // x = x - 1 // x = 5
        System.out.println(x);

        int j = 7;

        j++; // postfix increment
        ++j; // prefix increment

        // j = 9

        int k = j++; // k = 9, j = 10

        int l = ++j; // j = 11, l = 11

        System.out.println("j = " + j + " , k = " + k + " , l = " + l);
    }
}
