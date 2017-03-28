public abstract class Transport	{

	private String number;

	Transport () {
		this.number = null;
	}//end of Transport ()

	Transport (String number) {
		this.number = number;
	}//end of Transport (String number)

	public String numberToString() {
		return this.number;
	}//end of numberTostring()

	public void come(ParkingPlace parking) {

		TransportQueue inputQueue = parking.getInputQueue();
		TransportNode transportNode = new TransportNode(this);
		inputQueue.enqueue(transportNode);
	}

	public void leave(ParkingPlace parking) {

		TransportQueue outputQueue = parking.getOutputQueue();
		TransportNode transportNode = new TransportNode(this);
		outputQueue.enqueue(transportNode);	
	}

}//end of Transport class 