import java.util.Random;

class Program {

	public static void printHumansArray(Human humans[]) {

		for (int i=0; i < humans.length; i++) {

			// Human human = humans[i];
		
			System.out.printf("%s ", humans[i].getName());
			System.out.printf("%3d ", humans[i].getAge());
			System.out.printf("\n");	
		}

		System.out.printf("\n");

	};//end fo printHumansArray(Human humans[])


	public static void sortHumansArray(Human humans[]) {

		boolean sorted;

		do {

			sorted = true;

			for (int i=0; i < humans.length - 1; i++) {

				if (humans[i].getAge() > humans[i+1].getAge()) {

					Human humanTempPoint = humans[i];
					humans[i] = humans[i+1];
					humans[i+1] = humanTempPoint;

					if (i > 0 && humans[i-1].getAge() > humans[i].getAge()) {

						sorted = false;
					}
				}
			}

		} while (!sorted);

	}// end of sortHumansArray(Human humans[]) 


	public static void main(String[] args) {

		Random random = new Random();

		int numOfHumans = 15;

		Human humans[] = new Human[numOfHumans];

		for (int i=0; i < numOfHumans; i++) {

			humans[i] = new Human(String.format("Human%03d", i + 1), random.nextInt(100));
		};

		System.out.printf("\n");

		System.out.printf("Input Array: \n");
		printHumansArray(humans);
		
		sortHumansArray(humans);

		System.out.printf("Output Array: \n");
		printHumansArray(humans);
	}
}