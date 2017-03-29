class Program {

	private static final int QUEUE_SIZE = 5;
	private static final int STACK_SIZE = 10;


	public static void main(String args[]) {

		//===================================================
		System.out.printf("\nQUEUE:\n\n");

		HumanQueue queue = new HumanQueue();

		for (int i=0;i<QUEUE_SIZE*2;i++) {
			
			Human humanIN = new Human("Human"+i, i*10+1);
			System.out.printf("Enqueue New: <%s>\n", humanIN.toString());
			HumanNode humanNodeIN = new HumanNode(humanIN);

			queue.enqueue(humanNodeIN);
			queue.printQueue();

			if (queue.getCounter() >= QUEUE_SIZE) {

				HumanNode humanNodeOUT = queue.dequeue();
				Human humanOUT = humanNodeOUT.getHuman();
				System.out.printf("Dequeue Next: <%s>\n", humanOUT.toString());
			}

			System.out.printf("\n");
		
		}//end of for

		//===================================================
		System.out.printf("\nSTACK:\n\n");

		HumanStack stack = new HumanStack();

		for (int i=0;i<STACK_SIZE;i++) {

			Human humanIN = new Human("Human"+i, i*10+1);
			System.out.printf("Push New: <%s>\n", humanIN.toString());
			HumanNode humanNodeIN = new HumanNode(humanIN);

			stack.push(humanNodeIN);
			stack.printStack();

			System.out.printf("\n");
			
		}

		for (int i=0;i<STACK_SIZE;i++) {

			HumanNode humanNodeOUT = stack.pop();
			Human humanOUT = humanNodeOUT.getHuman();

			stack.printStack();
			System.out.printf("Was POPed: <%s>\n", humanOUT.toString()); 

			System.out.printf("\n");
			
		}

	}//end of main()	

}//end of Programm