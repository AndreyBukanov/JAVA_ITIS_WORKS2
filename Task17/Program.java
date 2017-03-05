import java.util.Random;

class Program {

	public static void printMatrix(int matrix[][]) {

		for (int i=0; i < matrix.length; i++) {
		
			for (int j=0; j < matrix[i].length; j++) {
				
				System.out.printf("%3d ", matrix[i][j]);
			}

			System.out.printf("\n");
		}

		System.out.printf("\n");
	}

	public static void fillMatrixRandom(int matrix[][]) {

		Random random = new Random();
		//random.nextInt(10);

		for (int i=0; i < matrix.length; i++) {
		
			for (int j=0; j < matrix[i].length; j++) {
				
				matrix[i][j] = random.nextInt(255);
			}
		}
	}

	public static void printMinInColumn(int matrix[][]) {

		for (int i=0; i < matrix[0].length; i++) {

			int minInColumn = matrix[0][i];

			for (int j=1; j < matrix.length; j++) {
			
				if (matrix[j][i] < minInColumn) {

					minInColumn = matrix[j][i];
				}	
			}

			System.out.printf("%d ", minInColumn);
		}

		System.out.printf("\n");
	}

	public static void main(String[] args) {

		int matrix[][] = new int[20][10];

		fillMatrixRandom(matrix);
		printMatrix(matrix);
		printMinInColumn(matrix);
	}
}