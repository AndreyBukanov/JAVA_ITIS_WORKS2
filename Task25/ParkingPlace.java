public class ParkingPlace {

	private TransportQueue inputQueue;
	private TransportQueue outputQueue;
	private Transport parkingArray[];
	private int size;
	private int counter;
	

	ParkingPlace (int size) {

		this.size         = size;
		this.parkingArray = new Transport[size];
		this.inputQueue   = new TransportQueue();
		this.outputQueue  = new TransportQueue();
	}

	private int getCellNumber(Transport transport) {

		for (int i=0; i < this.size; i++) {
			
			if (this.parkingArray[i] == transport) {
				return i;
			}
		}

		return -1;

	};//end of getCellNumber()

	private void checkInputQueue() {

		TransportNode newTransportNode = this.inputQueue.dequeue();

		if (newTransportNode != null) {

			if (this.counter < this.size) {

				for (int i=0; i < this.size; i++) {

					if (this.parkingArray[i] == null) { //free space
			
						this.parkingArray[i] = newTransportNode.getTransport();
						this.counter++;
						break;
					}
				}
			}

			else {

				this.outputQueue.enqueue(newTransportNode);
			}
		}

	}//end of checkInputQueue()


	private void checkOutputQueue() {

		TransportNode newTransportNode = this.outputQueue.dequeue();

		if (newTransportNode != null) {

			Transport transport = newTransportNode.getTransport(); 

			int cellNumber = getCellNumber(transport);

			if (cellNumber >= 0) {
				this.parkingArray[cellNumber] = null;
				this.counter--;	
			}
		}

	}//end of checkOutputQueue()

	public Transport getTransport(String number) {

		for (int i=0; i < size; i++) {
			
			Transport transport = this.parkingArray[i];

			if (transport.numberToString().equals(number)) {
				return transport;		
			}	
		}

		return null;

	};//end of getTransport()

	public TransportQueue getInputQueue () {
		return inputQueue;
	}//end of getInputQueue()

	public TransportQueue getOutputQueue () {
		return outputQueue;
	}//end of getInputQueue()

	public void nextStep() {

		checkInputQueue();
		checkOutputQueue();

	}//end of nextStep()

	public void print() {

		System.out.printf("===========================\n");
		System.out.printf("PARKING. Places:%d, Free:%d\n", this.size, this.size - this.counter);

		System.out.printf("Input Queue:\n");
		this.inputQueue.printQueue();

		System.out.printf("Parking Place:\n");		
		for (int i=0; i < counter; i++) {

			if (this.parkingArray[i] != null) {

				System.out.printf("[%s] ", this.parkingArray[i].numberToString());	
			}
		}
	
		System.out.printf("\n");

		System.out.printf("Output Queue:\n");
		this.outputQueue.printQueue();

	}//end of printParkingArray()

}//end of ParkingPlace class