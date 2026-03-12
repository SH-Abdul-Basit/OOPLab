import java.util.Scanner;
public class Lab05Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = 5;
		int cols = 4;
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		int[] colSums = new int[cols];
		System.out.println("Print 2-D array : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// Calculating the sum of columns
		for (int i = 0; i < cols; i++) {
			int sum = 0;
			for (int j = 0; j < rows; j++) {
				sum += matrix[j][i];
			}
			colSums[i] = sum;
		}
		System.out.println("Sum of columns : ");
		for (int i = 0; i < colSums.length; i++) {
			matrix[rows - 1][i] = colSums[i];
			System.out.println("Last row and Sum of columns " + i + " is " + colSums[i]);
		}
		System.out.println("Print 2-D array : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
}
