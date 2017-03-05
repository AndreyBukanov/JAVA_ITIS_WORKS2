class Program {


	private static boolean suffixCompare(char array[], int point1, int point2, int suffixLen) {

		for (int i=0; i < suffixLen; i++) {

			if (array[point1 + i] != array[point2 + i]) {

				return false;
			}

		}

		return true;
	
	}//end of suffixCompare()


	private static int maxSuffixInRange(char array[], int endPoint) {

		int maxSuffixIndex = 0;

		for (int i=0; i < endPoint; i++) {
			
			if (suffixCompare(array, 0, endPoint - i, i + 1)) {

				//if (maxSuffixIndex < i + 1) {

					maxSuffixIndex = i + 1;
				//}
			}
		}

		return maxSuffixIndex;

	}//end of maxSuffixInRange()


	private static void printIntArray(int array[]) {

		for (int i=0; i < array.length; i++) {
			
			System.out.printf("%d ", array[i]);
		}

		System.out.printf("\n");
	
	}//end of printIntArray()


	private static void printCharArray(char array[]) {

		for (int i=0; i < array.length; i++) {
			
			System.out.printf("%s ", array[i]);
		}

		System.out.printf("\n");
	
	}//end of printCharArray()



	public static void main(String[] args) {

		//                    0   1   2   3   4   5   6 
		//char inputArray[] = {'a','a','b','a','a','b','a'};
		//                   [-------------]
		//                               [-------------]

		// char inputArray[] = {'a','b','c','a','b','c','d'};
		// char inputArray[] = {'a','a','b','a','a','a','b'};
		// char inputArray[] = {'a','b','c','a','a','b','c', 'a'};

		char inputArray[] = {'a','b','c','#','d','b','c','a','b','c','d','a','b','c'};
		// char inputArray[] = {'a','a','#','d','d','d','d','d','a','a','a','a','d','d','d','d','d','d','a','a','a','a','a'};

		int outputArray[] = new int[inputArray.length];

		//for (int i=0; i < inputArray.length; i++) {
		outputArray[0] = 0;
		for (int i=1; i < inputArray.length; i++) {

			outputArray[i] = maxSuffixInRange(inputArray, i); 
			
		}

		printCharArray(inputArray);
		printIntArray(outputArray);
	}
}