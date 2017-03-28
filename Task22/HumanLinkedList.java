
public class HumanLinkedList {

    private HumanNode head;
    private HumanNode tail;

    private int count;

    public HumanLinkedList() {
    
        this.head  = null;
        this.tail  = null;
        this.count = 0;
    
    }//end of HumanLinkedList Construct


    public void addTo (HumanNode newHumanNode, int position) {


    }//end of addTo()


    public void addToHead (HumanNode newHumanNode) {

        this.addTo(newHumanNode, 1);

    }//end of addToHaed()


    public void addTotail (HumanNode newHumanNode) {

        this.addTo(newHumanNode, count + 1);

    }//end of addToTail()

}//end of HumanLinkedlist Class