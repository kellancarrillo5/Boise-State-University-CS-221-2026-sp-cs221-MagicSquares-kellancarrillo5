import java.util.Scanner;

/**
 * Implements MagicSquareInterface
 * @author kellancarrillo5
 */

public class MagicSquare implements MagicSquareInterface{
    private int[][] matrix;
    private boolean isValid;

    /**
     * Constructor to read a file
     * @param fileName
     */
    public MagicSquare(String fileName){
        
    }

    /**
     * Constructor to read and write a file
     * @param fileName
     * @param dimension
     */
    public MagicSquare(String fileName, int dimension){
        

    }


    @Override
    public boolean isMagicSquare() {
        Scanner scnr = 
        // update givenSize to current and magicNumber with n(n^2 + 1) / 2
    

        //check diagonals + rows + cols == magic number

        //not true == flase, true == true


        throw new UnsupportedOperationException("Unimplemented method 'isMagicSquare'");
    }

    @Override
    public int[][] getMatrix() {
        //read from file or generated
        // create a new board that will return the current copy
        int[][] copy = new matrix[matrix.length][matrix.length];

        //go through rows + cols with nested for loop
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                copy[row][col] = matrix[row][col];
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
        String displayString = "The matrix: \n";

        //call isMagicSquare, if true display is a magic square. otherwise is not a magic square.



         throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
    

}


