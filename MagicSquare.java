/**
 * Implements MagicSquareInterface
 * @author kellancarrillo5
 */

public class MagicSquare implements MagicSquareInterface{
    private int[][] magicSquare;
    private int magicNumber;
    private int givenSize;
    private String displayString;


    @Override
    public boolean isMagicSquare() {
        // update givenSize to current and magicNumber with n(n^2 + 1) / 2
    

        //check diagonals + rows + cols == magic number

        //not true == flase, true == true


        throw new UnsupportedOperationException("Unimplemented method 'isMagicSquare'");
    }

    @Override
    public int[][] getMatrix() {
        //read from file or generated
        // create a new board that will return the current copy
        int[][] copy = new magicSquare[][];

        //go through rows + cols with nested for loop
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                copy[row][col] = magicSquare[row][col];
            }
        }
        return copy;
       
    }
    
    @Override
    public String toString(){
        //Display formatted statement
        // The matrix:
	    // 16 3 2 13
	    // 5 10 11 8
	    // 9 6 7 12
	    // 4 15 14 1
        // is a magic square.
        displayString =  "The matrix: \n" ;

        //call isMagicSquare, if true display is a magic square. otherwise is not a magic square.



         throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

}


