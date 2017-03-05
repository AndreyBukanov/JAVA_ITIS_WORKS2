class Program {

	public static void printIntArray(int array[]) {

		for (int i=0; i < array.length; i++) {
			
			System.out.printf("%d ", array[i]);
		}

		System.out.printf("\n");
	
	}//end of printIntArray()


	public static void printCharArray(char array[]) {

		for (int i=0; i < array.length; i++) {
			
			System.out.printf("%s ", array[i]);
		}

		System.out.printf("\n");
	
	}//end of printCharArray()


	public static void prefixFunc(char inputArray[], int outputArray[]) {

		for (int i=1; i < inputArray.length; i++) {
			
			int j = outputArray[i - 1];

			while (j > 0 && inputArray[i] != inputArray[j]) {

				j = outputArray[j - 1];
			}

			if (inputArray[i] == inputArray[j]) {

				j++;
			}

			outputArray[i] = j;
		}

	}//end of prefixFunc()

	public static void main(String[] args) {

		//              0   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16  17  18  19  20
		char text[] = {'t','e','x','t','t','e','x','w','w','o','r','d','t','w','o','r','w','o','r','d'};
		//              ---------------------------===-[8------------]-----===========-[16-----------]
		char word[] = {'w','o','r','d'};

		
		char tempArray[] = new char[text.length + word.length + 1];

		
		//fill temp array
		for (int i = 0;	i < word.length; i++) {

			tempArray[i] = word[i];
		}

		tempArray[word.length] = '#';

		for (int i = word.length + 1; i < text.length + word.length + 1; i++) {
			
			tempArray[i] = text[i - word.length - 1];
		}


		int prefixArray[] = new int[text.length + word.length + 1];

		//get prefix values

		prefixFunc(tempArray, prefixArray);

		//print result
		printCharArray(tempArray);
		printIntArray(prefixArray);

		int resultCount = 0;

		//check
		for (int i=0; i < prefixArray.length; i++) {

			if (prefixArray[i] == word.length) {

				resultCount++;

				System.out.printf("Result #%d: %d\n", resultCount, i - 2 * word.length);

			}		
		}	

		System.out.printf("Total Result: %d\n", resultCount);

	}
}