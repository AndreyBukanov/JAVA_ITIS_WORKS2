import java.util.Random;

class Program {

	public static void main(String[] args) {

		Random random = new Random();

		System.out.printf("Input 10 values: ");

		int array[] = new int[10];
		
		int max = 0;
		int min = 0;

		for (int i = 0; i < 10; i++) {

			array[i] = random.nextInt();
			System.out.printf("%d ", array[i]);

			if (array[i] < min) {

				min = array[i];
			}

			if (array[i] > max) {

				max = array[i];
			}
		}

		System.out.printf("\n");
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}