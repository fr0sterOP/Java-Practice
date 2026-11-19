package iteration;

public class loop {
    public static void main(String[] args) {
        // While loop

        // int i = 6;
        // while (i <= 5) {
        // System.out.println("i is: " + i);
        // i++;
        // }

        // Do-While loop

        // int j = 5;
        // do {
        // System.out.println("j is: " + j);
        // j++;
        // } while (j < 5);

        // For loop

        // for (int k = 0; k < 5; k++) {
        // System.out.println("k is: " + k);
        // }

        // coma separated for loop

        // for (int l = 1, m = 1; l < 5 && m < 10; l++, m++) {
        // System.out.println(l * m);
        // }

        // Nested for loop

        for (int n = 1; n <= 5; n++) {
            for (int o = 1; o <= n; o++) {
                System.out.print(o);
            }
            System.out.println();
        }

        // jump statement - Break, Continue

        int p = 7;
        int q;

        for (q = 2; q < p; q++) {
            if (p % q == 0) {
                System.out.println("the number is not prime");
                break;
            }
        }

        if (q == p) {
            System.out.println("the number is prime");
        }

        for (int r = 1; r <= 10; r++) {
            if (r % 2 == 0) {
                continue;
            }
            System.out.println(r);
        }
    }

}
