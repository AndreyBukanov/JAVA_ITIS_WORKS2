public class HumanQueue	{

	private HumanNode head;
	private int counter;

	
	HumanQueue () {
		this.head = null;
		this.counter = 0;
	}


	private HumanNode getNode(int number) {

		HumanNode retNode;

		if (number == 0) {

			retNode = null;
		
		}
		
		else {

			retNode = this.head;

			for (int i=1; i < number; i++) {

				retNode = retNode.getNextNode();
			}

		}

		return retNode;
	
	}//end of getNode()

	public void enqueue(HumanNode humanNode) {
		
		humanNode.setNextNode(this.head);
		this.head = humanNode;
		this.counter++;
	
	}//end of enqueue


	public HumanNode dequeue() {

		HumanNode retNode;		

		switch (this.counter) {

			case 0:
				retNode = null;
				break;
			
			case 1:
				retNode = this.head;
				this.head = null;
				this.counter--;
				break;

			default:
				HumanNode preLastNode = getNode(this.counter-1);
				retNode = preLastNode.getNextNode();
				preLastNode.setNextNode(null);
				this.counter--;
				break;
		}

		return retNode;
	
	}//end of dequeue()

	public int getCounter(){
		return this.counter;
	}//end of getCounter()

	public void printQueue() {//TODO: String toString();

		HumanNode nodeToPrint = this.head;

		for (int i=0; i < counter; i++) {
			
			Human human = nodeToPrint.getHuman();

			System.out.printf("[%s] ", human.toString());

			nodeToPrint = nodeToPrint.getNextNode();
		}

		System.out.printf("\n");
	
	};//end of printQueue()

}//end of HumanQueue class