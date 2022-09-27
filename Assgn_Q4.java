import java.util.Scanner;
public class Assgn_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            int sumr = 0;
            int sumc = 0;
            for (int j = 0; j < 3; j++) {
                sumr += mat[i][j];
                sumc += mat[j][i];
            }
            System.out.printf("Sum of row %d is: %d\n", i + 1, sumr);
            System.out.printf("Sum of column %d is: %d\n", i + 1, sumc);
        }
    }
}