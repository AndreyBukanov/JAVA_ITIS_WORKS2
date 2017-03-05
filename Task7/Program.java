import java.util.Random;

class Program {

	public static void main(String[] args) {

		Random random = new Random();

		System.out.printf("Input 10 values: ");

		int array[] = new int[10];
		int sum = 0;

		for (int i = 0; i < 10; i++) {

			array[i] = random.nextInt();
			sum += array[i];
			System.out.printf("%d ", array[i]);
		}

		System.out.printf("\nResult: %d \n", sum);
	}
}