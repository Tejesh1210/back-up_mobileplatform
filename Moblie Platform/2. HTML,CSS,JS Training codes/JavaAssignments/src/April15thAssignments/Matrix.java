package April15thAssignments;

public class Matrix {
    private int[][] matrix;
    public Matrix(int rows, int cols) {
    matrix = new int[rows][cols];
    }
    public void fillMatrix(int[][] values) {
    if (values.length != matrix.length || values[0].length != matrix[0].length) {
    System.out.println("Error: Provided values dimensions do not match matrix dimensions.");
    return;
    }
    for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[0].length; j++) {
    matrix[i][j] = values[i][j];
    }
    }
    }
    public void printMatrix() {
    for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[0].length; j++) {
    System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
    }
    }

    public static void main(String[] args) {
        // Example usage
        int[][] values = {{5,8, 4}, {2, 6, 8}, {7,4 , 9}};
        Matrix matrix= new Matrix(3, 3);
        matrix.fillMatrix(values);
        System.out.println("Matrix:");
        matrix.printMatrix();
        }
    }
       
    