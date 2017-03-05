class Program {

	public static void main(String[] args) {

		//              1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16  17  18  19  20
		char text[] = {'t','e','x','t','t','e','x','w','w','o','r','d','t','w','o','r','w','o','r','d'};
		//              ---------------------------===-[-------------]-----===========-[-------------]
		char word[] = {'w','o','r','d'};

		int resultCount = 0;
		int overlap = 0;

		for (int i=0; i < text.length ; i++) {
			
			if (text[i] == word[overlap]) {

				overlap++;//inc overlap count
			}

			else {
				
				i = i - overlap;//turn back
				overlap = 0;//reset overlap count
			}

			if (overlap == word.length) {

				//we found!!!
				resultCount++;
				System.out.printf("%d: %d\n", resultCount, (i + 1) - (word.length - 1));
				overlap = 0;//reset overlap count
			}
		};

		System.out.printf("Results: %d\n", resultCount);
	}
}