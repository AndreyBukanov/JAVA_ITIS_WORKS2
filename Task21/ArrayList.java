public class ArrayList {

    private int listSize;
    private int pointer;
    private char elements[];

    public ArrayList(int newListSize) {

        listSize = newListSize;
        pointer = 0;
        elements = new char[listSize];

    }//end of ArrayList() constructor

    public void print() {

        for (int i=0; i<pointer; i++) {
            
            System.out.printf("%c", elements[i]);
        }
        
    }//end of print()

    public void println() {

        print();
        System.out.printf("\n");

    }//end of println()

    public void addNext(char newSymbol)
    {
        if (pointer < listSize) {

            elements[pointer] = newSymbol;
            pointer++;
        }

        else {

            System.out.printf("%s\n", "Error: Out of Range...(+)"); 
        }

    }//end of addNext();

    public void stepBack(int steps){

        if (pointer - steps >= 0) {

            for (int i=0; i<steps; i++) {
                
                elements[pointer] = ' ';
                pointer--;
            }
        }

        else {

            System.out.printf("%s\n", "Error: Out of Range...(-)");
        }

    }//end of stepBack()

    public int getSize() {

        return listSize;
    
    }//end of getSize()

    
    public int getPosition() {

        return pointer;
    
    }//end fo getPosition()

}//end of ArrayList