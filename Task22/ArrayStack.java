public class ArrayStack {

    private int stackSize;
    private int pointer;
    private char elements[];

    
    ArrayStack (int newSize) {

        stackSize = newSize;
        pointer = 0;
        elements = new char[stackSize];

    }//end of ArrayStack construct

    public void println() {

        for (int i=0; i<pointer; i++) {
            
            System.out.printf("%c", elements[i]);            
        }

        System.out.printf("\n");
    };

    public void push(char newSymbol) {

        if (pointer < stackSize) {

            elements[pointer] = newSymbol;
            pointer++;
        }

        else {

            System.out.printf("%s\n", "Error: Satck Overflow...");
        }
    
    }//end of push()


    public char pop() {

        char retVal;

        if (pointer > 0) {
            
            pointer--;
            retVal = elements[pointer];
        }

        else {

            System.out.printf("%s\n", "Error: Satck is Empty...");
            retVal = 'E';
        }

        return retVal;

    }//end of pop()

    public char view() {

        char retVal;

        if (pointer != 0){
            
            retVal = elements[pointer - 1];
            
        }

        else {

            retVal = ' ';
        }

        return retVal;
        
    }//end of view()

    public int getSize() {

        return stackSize;

    }//end of getSize()


    public int getPosition() {

        return pointer;

    }//end of getPosition()

}//end of ArrayStack