import java.util.Scanner;

class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Input Sequence: ");

		// int in_val = scanner.nextInt();
		// an is the part of sequence???

		int in_val = 0;
		int sum = 0;
		int mult = 0;

		do {

			in_val = scanner.nextInt();

			if (in_val > 0) { 

				if (mult == 0) mult = in_val;
				else mult *= in_val;
			}

			if (0 != in_val % 2) {

				sum += in_val;
			}

			
		} while (-1 != in_val);

		System.out.printf("\nResult: %d %d \n", mult, sum);
	}
}