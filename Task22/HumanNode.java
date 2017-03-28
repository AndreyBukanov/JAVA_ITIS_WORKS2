
public class HumanNode {
    

    private Human     human;
    private HumanNode nextNode;

    
    public HumanNode() {
        
        this.human = null;
        this.nextNode = null;
    
    }//end of HumanNode Construct

    public HumanNode(Human human) {
        
        this.human = human;
        this.nextNode = null;
    
    }//end of HumanNode Construct

    public HumanNode(Human human, HumanNode nextNode) {
        
        this.human = human;
        this.nextNode = nextNode;
    
    }//end of HumanNode Construct

    public HumanNode(String humanName, int humanAge) {
        
        Human human = new Human(humanName, humanAge);

        this.human = human;
        this.nextNode = null;
    
    }//end of HumanNode Construct



    public Human getHuman() {
        
        return this.human;    
    
    }//end of getHuman()


    public HumanNode getNextNode() {
        
        return this.nextNode;
    
    }//end of getNextNode()


    public void setNextNode(HumanNode nextNode) {

        this.nextNode = nextNode;

    }//end of setNextNode()

    public void setHuman(Human newHuman) {

        this.human = newHuman;

    }//end of setNextNode()

}//end of HumanNode Class
