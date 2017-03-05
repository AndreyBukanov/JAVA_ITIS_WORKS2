import java.util.Scanner;

class Program {

	private static int getNumericSum(int in_val) {

		int sum = 0;

		while (in_val != 0) {

			sum += in_val % 10;
			in_val /= 10;
		}

		return sum;
	}

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

			sum = Program.getNumericSum(in_val);

			if (7 == sum % 10) {

				if (mult == 0) mult = in_val;
				else mult *= in_val;
			}

		} while (-1 != in_val);

		System.out.printf("\nResult: %d \n", mult);
	}
}