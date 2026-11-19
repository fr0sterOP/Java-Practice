package arrey;

public class two_d {
    public static void main(String[] args) {
        // 2-D Array

        // int[][] marks = new int[3][3];

        // marks[0][0] = 1;
        // marks[0][1] = 2;
        // marks[0][2] = 3;

        // marks[1][0] = 4;
        // marks[1][1] = 5;
        // marks[1][2] = 6;

        // marks[2][0] = 7;
        // marks[2][1] = 8;
        // marks[2][2] = 9;

        // for (int raw = 0; raw < marks.length; raw++) {
        // for (int col = 0; col < marks[raw].length; col++) {
        // System.out.print(marks[raw][col] + " ");
        // }
        // System.out.println();
        // }

        int[][] marks = new int[3][];

        marks[0] = new int[1];
        marks[1] = new int[2];
        marks[2] = new int[3];

        marks[0][0] = 1;
        marks[1][0] = 2;
        marks[1][1] = 3;
        marks[2][0] = 4;
        marks[2][1] = 5;
        marks[2][2] = 6;

        for (int raw = 0; raw < marks.length; raw++) {
            for (int col = 0; col < marks[raw].length; col++) {
                System.out.print(marks[raw][col] + " ");
            }
            System.out.println();
        }
    }
}
