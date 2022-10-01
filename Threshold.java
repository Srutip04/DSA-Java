import java.util.Scanner;

public class Threshold {
    // variable threshold i.e min and max threshold as input
    public static void newMatrix(int[][] arr, int n, int m) {
        int[][] mat = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] <= n) {
                    mat[i][j] = -1;
                }
                if (arr[i][j] > n && arr[i][j] <= m) {
                    mat[i][j] = 0;
                }
                if (arr[i][j] > m) {
                    mat[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("enter the values for the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("enter threshold");
        System.out.println("enter min:");
        int mint = sc.nextInt();
        System.out.println("enter max:");
        int maxt = sc.nextInt();
        System.out.println("New matrix on threshold");
        newMatrix(arr, mint, maxt);
    }
}