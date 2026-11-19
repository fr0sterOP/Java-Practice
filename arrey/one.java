package arrey;

public class one {
    public static void main(String[] args) {
        // 1-D Array
        int[] rollNums = new int[3];

        // Without loop
        // rollNums[0] = 101;
        // rollNums[1] = 102;
        // rollNums[2] = 103;

        // System.out.println(rollNums[0]);
        // System.out.println(rollNums[1]);
        // System.out.println(rollNums[2]);
        // System.out.println(rollNums[3]); // ArrayIndexOutOfBoundsException

        // System.out.println(rollNums.length); // 3

        // With for loop
        int x = 101;

        for (int i = 0; i < rollNums.length; i++) {
            rollNums[i] = x;
            x++;
        }

        for (int i = 0; i < rollNums.length; i++) {
            System.out.println(rollNums[i]);
        }
    }
}