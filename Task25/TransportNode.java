public class TransportNode	{

	private Transport     transport;
	private TransportNode nextNode;


	TransportNode () {
		this.transport = null;
		this.nextNode  = null; 
	}//end of TransportNode ()

	TransportNode (Transport transport) {
		this.transport = transport;
		this.nextNode  = null; 
	}//end of TransportNode ()


	public void setNextNode(TransportNode nextNode) {
		this.nextNode = nextNode;
	}//end of setNextNode();

	public void setTransport(Transport transport) {
		this.transport = transport;
	}//end of setTransport();


	public Transport getTransport() {
		return this.transport;
	};//end of getTransport()

	public TransportNode getNextNode() {
		return this.nextNode;
	};//end of getNextNode()

}//end of TransportNode class