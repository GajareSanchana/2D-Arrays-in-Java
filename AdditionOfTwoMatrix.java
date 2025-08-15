//write a program to add two matrices without taking extra array

public class AdditionOfTwoMatrix{
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{15, 8, 3}, {9, 5, 6}, {3, 4, 9}};
        
        int m = a.length;
        int n = a[0].length;

        // Adding matrices a and b directly
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = a[i][j] + b[i][j];  // Modify a directly
            }
        }

        // Printing the result
        System.out.println("Resulting Matrix (sum of a and b):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
