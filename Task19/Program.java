class Program {

	public static int fibRequrse(int n, int memory[]) {

		if (n == 1) {

			memory[n-1] = 1;		
		}

		else if (n == 2) {

			memory[n-1] = 1;
			memory[n-2] = 1;
		}

		else {

			memory[n-1] = fibRequrse(n-1, memory) + memory[n-3];			
		}

		return memory[n-1];
		
	};//end of fibRequrse(int n, int memory[])


	public static int fibRequrse(int n) {

		int memory[] = new int[n];

		return fibRequrse(n, memory);
		
	};//end of fibRequrse(int n)


	public static int fibLinear(int n) {

		if (n == 1 || n == 2) {

			return 1;
		}

		int memory[] = new int[3];

		memory[0] = 1;
		memory[1] = 1;

		for (int i=3; i <= n; i++) {

			memory[2] = memory[1] + memory[0];

			memory[0] = memory[1];
			memory[1] = memory[2];
		}

		return memory[1];

	};//end of fibLinear(int n)

	public static void main(String[] args) {

		int resultReq = fibRequrse(15);
		int resultLine = fibLinear(15);

		System.out.printf("Result (Requrse): %d\n", resultReq);
		System.out.printf("Result  (Linear): %d\n", resultLine);

	}
}