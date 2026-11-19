package Conditional;

public class one {
    public static void main(String[] args) {

        // Selection statement

        int i = 12;
        int j = 20;

        if (i > 10 && i < 20) {
            System.out.println("i is greater than 10");
        } else {
            System.out.println("i is not greater than 10 or it is equal to 10");
        }

        if (j % 2 == 0) {
            System.out.println("j is even");
        } else {
            System.out.println("j is odd");
        }

        // Nested if statement

        int k = 15;
        if (k > 10) {
            if (k < 20) {
                System.out.println("k is between 10 and 20");
            } else {
                System.out.println("k is greater than or equal to 20");
            }
        } else {
            System.out.println("k is less than or equal to 10");
        }

        // if-else-if ladder

        int l = 20;
        if (l == 10) {
            System.out.println("l is equal to 10");
        } else if (l == 20) {
            System.out.println("l is equal to 20");
        } else if (l == 30) {
            System.out.println("l is equal to 30");
        } else {
            System.out.println("l is neither 10 nor 20 nor 30");
        }

        // switch statement

        int m = 2;
        switch (m) {
            case 1:
                System.out.println("m is 1");
                break;
            case 2:
                System.out.println("m is 2");
                break;
            case 3:
                System.out.println("m is 3");
                break;
            default:
                System.out.println("m is neither 1 nor 2 nor 3");
        }

        // Nested switch statement

        int n = 1;
        int p = 2;
        switch (n) {
            case 1:
                System.out.println("n is 1");
                switch (p) {
                    case 1:
                        System.out.println("p is 1");
                        break;
                    case 2:
                        System.out.println("p is 2");
                        break;
                    default:
                        System.out.println("p is neither 1 nor 2");
                }
                break;
            case 2:
                System.out.println("n is 2");
                break;
            default:
                System.out.println("n is neither 1 nor 2");
        }

    }
}
