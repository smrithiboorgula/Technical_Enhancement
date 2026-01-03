public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {7, 8, 9},
                {10, 11, 12}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}