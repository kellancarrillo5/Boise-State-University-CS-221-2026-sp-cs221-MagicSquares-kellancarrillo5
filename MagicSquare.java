import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    public MagicSquare(String fileName)throws FileNotFoundException {
        this.matrix = readMatrix(fileName);
        isValid = isMagicSquare();
    }

    /**
     * Constructor to read and write a file
     * @param fileName
     * @param dimension
     * @throws IOException 
     */
    public MagicSquare(String fileName, int dimension) throws IOException{
        this.matrix = matrix; 
        writeMatrix(matrix, fileName);  
        isValid = isMagicSquare();    

    }

    private int[][] readMatrix(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scnr = new Scanner(file);
        int matrixSize = Integer.parseInt(scnr.nextLine().trim());
        int [][] currentMatrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++)
        	{
             	if (!scnr.hasNextLine())
             	{
                   	throw new FileNotFoundException("Invalid file format");
             	}
             	Scanner scanner = new Scanner(scnr.nextLine());
             	for (int j = 0; j < matrixSize; j++)
             	{
                   	if (!scanner.hasNextInt())
                   	{	
                        	throw new FileNotFoundException("Invalid file format");
                   	}
                   	currentMatrix[i][j] = scanner.nextInt();
             	}
        	}
        	return currentMatrix;
  	}



    /**
     * writes a matrix to a file
     * @param matrix
     * @param fileName
     * @throws IOException
     */
    public static void writeMatrix(int[][] matrix, String fileName) throws IOException{
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
        int n = matrix.length;
        outFile.println(n);
            for (int[] row : matrix)
        	    {
             	    for (int val : row)
             	{
                   	outFile.print(val + " ");
             	}
             	outFile.println();
        	}
        	outFile.close();
        }
    
    public static int[][] generateMagicSquare(int n){
        int[][] magicSquare = new int[n][n];
        	int num = 1;
        	int row = n - 1;
        	int col = n / 2;
        	int oldRow;
        	int oldCol;

        	while (num <= n * n)
        	{
             	magicSquare[row][col] = num++;
             	oldRow = row;
             	oldCol = col;
             	row++;
             	col++;
             	if (row == n)
             	{
                   	row = 0;
             	}
             	if (col == n)
             	{
                   	col = 0;
             	}
             	if (magicSquare[row][col] != 0)
             	{
                   	row = oldRow - 1;
                   	col = oldCol;
             	}
        	}
        	return magicSquare;

    }
    



    @Override
    public boolean isMagicSquare(){
          if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length;
        int magicConstant = n * (n * n + 1) / 2;

        // Check all numbers 1..n^2 appear exactly once
        boolean[] seen = new boolean[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = matrix[i][j];
                if (val < 1 || val > n * n || seen[val]) {
                    return false;
                }
                seen[val] = true;
            }
        }

        // Check rows and columns
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }

            if (rowSum != magicConstant || colSum != magicConstant) {
                return false;
            }
        }

        // Check main diagonal
        int diag1 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += matrix[i][i];
        }
        if (diag1 != magicConstant) {
            return false;
        }

        // Check secondary diagonal
        int diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag2 += matrix[i][n - 1 - i];
        }
        if (diag2 != magicConstant) {
            return false;
        }

        return true;
    }


    @Override
    public int[][] getMatrix() {
        //read from file or generated
        // create a new board that will return the current copy
        int n = matrix.length;
        int[][] copy = new int[n][n];

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
        
        // Add matrix with formatting 
        for (int i = 0; i < matrix.length; i++) {
            displayString += "\t";
            for (int j = 0; j < matrix[i].length; j++) {
                displayString += matrix[i][j];
                if (j < matrix[i].length - 1) {
                    displayString += " ";
                }
            } 
            if (i < matrix.length - 1) {
                displayString += "\n";
            }
        }
        
        displayString += "\n";
        displayString += isMagicSquare() ? "is a magic square." : "is not a magic square.";
        
        return displayString; 
    }
    
}


