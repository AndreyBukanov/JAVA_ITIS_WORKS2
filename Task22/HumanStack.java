public class HumanStack	{

	private HumanNode head;
	private int counter;
	
	HumanStack () {
		this.head = null;
		this.counter = 0;
	}

	public void push(HumanNode humanNode) {

		humanNode.setNextNode(this.head);
		this.head = humanNode;
		this.counter++;

	}//end of push()

	public HumanNode pop() {
	
		HumanNode retNode = null;
		
		if (counter > 0) {
		
			retNode = this.head;
			this.head = this.head.getNextNode();
			this.counter--;
		
		}

		return retNode;
	
	}//end of pop()

	public int getCounter(){
		return this.counter;
	}//end of getCounter()


	public void printStack() {

		HumanNode humanNode = this.head;

		for (int i=0;i<this.counter;i++) {
			
			Human human = humanNode.getHuman();
			System.out.printf("[%s] ", human.toString());

			humanNode = humanNode.getNextNode();
		}

		System.out.printf("\n");

	};//end of printStack()

}//end of HumanStack class