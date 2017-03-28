public class TransportQueue	{

	private TransportNode head;
	private int counter;

	
	TransportQueue () {
		this.head = null;
		this.counter = 0;
	}


	private TransportNode getNode(int number) {

		TransportNode retNode;

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

	public void enqueue(TransportNode transportNode) {
		
		transportNode.setNextNode(this.head);
		this.head = transportNode;
		this.counter++;
	
	}//end of enqueue

	

	public TransportNode dequeue() {

		TransportNode retNode;		

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
				TransportNode preLastNode = getNode(this.counter-1);
				retNode = preLastNode.getNextNode();
				preLastNode.setNextNode(null);
				this.counter--;
				break;
		}

		return retNode;
	
	}//end of dequeue()

	public void printQueue() {//TODO: String toString();

		TransportNode nodeToPrint = this.head;

		for (int i=0; i < counter; i++) {
			
			Transport transport = nodeToPrint.getTransport();

			System.out.printf("[%s] ", transport.numberToString());

			nodeToPrint = nodeToPrint.getNextNode();
		}

		System.out.printf("\n");
	
	};//end of printQueue()

}//end of TransportQueue class