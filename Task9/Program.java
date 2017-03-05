import java.util.Random;

class Program {

	public static void main(String[] args) {

		Random random = new Random();

		System.out.printf("Input 10 values: ");

		int array[] = new int[10];
		int max_count = 0;

		for (int i = 0; i < 10; i++) {

			array[i] = random.nextInt();
			System.out.printf("%d ", array[i]);
		}

		for (int i = 1; i < 9; i++) {

			if (    (array[i-1] <= array[i]) 
				 && (array[i+1] <  array[i]) ) max_count++;
			
		}

		System.out.printf("\nResult: %d \n", max_count);
	}
}