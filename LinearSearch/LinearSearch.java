package LinearSearch;

public class LinearSearch {

    private int[] theArray = new int[50];

    private int arraySize = 10;

    public static void main(String[] args){

        LinearSearch newArray = new LinearSearch();

        newArray.generateRandomArray();

        newArray.printHorzArray(-1,-1);

        newArray.linearSearchForValue(10);




    }




    public void generateRandomArray(){

        for(int i = 0; i < arraySize; i++){

            theArray[i] = (int)(Math.random()*10)+10;

        }

    }


    public String linearSearchForValue(int value){

        boolean valueInArray = false;

        String indexsWithValue = "";

        for(int i = 0; i < arraySize; i++){

            if(theArray[i] == value){

                valueInArray = true;

                indexsWithValue+= i + " ";

            }

            printHorzArray(i, -1);

        }

        if(!valueInArray){

            indexsWithValue = "None";

        }

        System.out.print("The Value was Found in the Following: " + indexsWithValue);

        System.out.println();

        return indexsWithValue;

    }




    public void printHorzArray(int i, int j){

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < arraySize; n++){

            System.out.print("| " + n + "  ");

        }

        System.out.println("|");

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < arraySize; n++){

            System.out.print("| " + theArray[n] + " ");

        }

        System.out.println("|");

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        // END OF FIRST PART


        // ADDED FOR BUBBLE SORT

        if(j != -1){

            // ADD THE +2 TO FIX SPACING

            for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");

            System.out.print(j);

        }


        // THEN ADD THIS CODE

        if(i != -1){

            // ADD THE -1 TO FIX SPACING

            for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");

            System.out.print(i);

        }

        System.out.println();

    }

    public void swapValues(int indexOne, int indexTwo){


        int temp = theArray[indexOne];

        theArray[indexOne] = theArray[indexTwo];

        theArray[indexTwo] = temp;

    }

}
