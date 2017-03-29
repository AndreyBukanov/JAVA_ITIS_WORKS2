public class HumanNode	{

	private Human     human;
	private HumanNode nextNode;


	HumanNode () {
		this.human = null;
		this.nextNode  = null; 
	}//end of HumanNode ()

	HumanNode (Human human) {
		this.human = human;
		this.nextNode  = null; 
	}//end of HumanNode ()


	public void setNextNode(HumanNode nextNode) {
		this.nextNode = nextNode;
	}//end of setNextNode();

	public void setHuman(Human human) {
		this.human = human;
	}//end of setHuman();


	public Human getHuman() {
		return this.human;
	};//end of getHuman()

	public HumanNode getNextNode() {
		return this.nextNode;
	};//end of getNextNode()

}//end of HumanNode class