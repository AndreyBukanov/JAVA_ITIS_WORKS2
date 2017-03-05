import java.util.Scanner;

class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Input Sequence: ");

		// int in_val = scanner.nextInt();
		// an is the part of sequence???

		int in_val = 0;
		int sum = 0;

		boolean even = false;

		do {

			in_val = scanner.nextInt();

			if (even) {

				sum += in_val;
				even = false;
			}

			else even = true;

		} while (-1 != in_val);

		System.out.printf("\nResult: %d \n", sum);
	}
}