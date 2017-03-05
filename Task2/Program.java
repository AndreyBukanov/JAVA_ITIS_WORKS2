import java.util.Scanner;

class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Input Value: ");

		int in_val = scanner.nextInt();

		int sum = 0;

		while (in_val != 0) {

			sum += in_val % 10;
			in_val /= 10;
		}

		System.out.printf("\nResult: %d \n", sum);
	}
}