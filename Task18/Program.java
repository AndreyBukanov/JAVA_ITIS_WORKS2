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

	public static void printSecDiagonal(int matrix[][]) {

		for (int i=0; i < matrix.length; i++) {

			System.out.printf("%d ", matrix[i][matrix.length - i - 1]);
		}

		System.out.printf("\n");
	}

	public static void main(String[] args) {

		int matrix[][] = new int[10][10];

		fillMatrixRandom(matrix);
		printMatrix(matrix);
		printSecDiagonal(matrix);
	}
}