import java.util.Scanner;

class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int val_array[] = {5000, 1000, 500, 100, 50, 10, 5, 2, 1};

		System.out.printf("Input Value: ");

		int in_val = scanner.nextInt();

		int i = 0;

		System.out.println("Result: ");

		while (i < val_array.length) {

			int cur_val = in_val / val_array[i];

			//if (cur_val != 0){
				
				System.out.printf("%d - %d \n", val_array[i], cur_val);
			//}

			in_val = in_val - cur_val * val_array[i];

			i++;//inc
		}
	}
}