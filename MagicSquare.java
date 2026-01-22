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

    /**
     * Constructor to read a file for the -check flag in the driver class
     * @param fileName
     */
    public MagicSquare(String fileName)throws FileNotFoundException {
        this.matrix = readMatrix(fileName);
    }

    /**
     * Constructor for the -create flag in the driver class, generatign a magic square and writing the matrix
     * @param fileName
     * @param dimension
     * @throws IOException 
     */
    public MagicSquare(String fileName, int dimension) throws IOException{
        this.matrix = generateMagicSquare(dimension);
        writeMatrix(matrix, fileName);  
    }

    /**
     * Reads the matrix from the fileName input
     * @param fileName
     * @return
     * @throws FileNotFoundException
     */
    private int[][] readMatrix(String fileName) throws FileNotFoundException {
        //create a scanner for the fileName given
        File file = new File(fileName);
        Scanner scnr = new Scanner(file);

        //get the size from the first number in the file 
        int matrixSize = Integer.parseInt(scnr.nextLine().trim());
        int [][] currentMatrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++){
             	if (!scnr.hasNextLine()){ //make sure the file has the correct amount of columns 
                   	throw new FileNotFoundException("Invalid file format");
             	}

             	Scanner scanner = new Scanner(scnr.nextLine());

             	for (int j = 0; j < matrixSize; j++){
                   	if (!scanner.hasNextInt()){//make sure the file has the correct amount of rows
                        throw new FileNotFoundException("Invalid file format");
                   	}
                   	currentMatrix[i][j] = scanner.nextInt();
             	}
                scnr.close();
                scanner.close();
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
            for (int[] row : matrix){
             	for (int val : row){
                   	outFile.print(val + " ");
             	}
             	outFile.println();
        	}
        	outFile.close();
        }
    /**
     * Generates a magic square with the provided int n
     * @param n
     * @return
     */
    public static int[][] generateMagicSquare(int n){
        int[][] magicSquare = new int[n][n];
        int num = 1;
        int row = n - 1;
        int col = n / 2;
        int oldRow;
        int oldCol;

        while (num <= n * n){
            magicSquare[row][col] = num++;
            oldRow = row;
            oldCol = col;
            row++;
            col++;
            if (row == n){
                row = 0;
            }if (col == n){
                col = 0;
            }if (magicSquare[row][col] != 0){
                row = oldRow - 1;
                col = oldCol;
                }
        	}
        	return magicSquare;

    }
    

    @Override
    public boolean isMagicSquare(){
        int n = matrix.length;
        int magicConstant = n * (n * n + 1) / 2;    

        // Check all numbers 1..n^2 appear exactly once
        boolean[] seen = new boolean[n * n + 1];
        for (int[] row : matrix){
            for (int num : row){
                if (num < 1 || num > n * n || seen[num]){
                    return false;
                }
                    seen[num] = true;
             	}
        	}

        for (int[] row : matrix){
            int sum = 0;
            for (int num : row){
                sum += num;
                }
            if (sum != magicConstant){
                return false;
             	}
        	}

        	for (int col = 0; col < n; col++)
        	{
             	int sum = 0;
             	for (int row = 0; row < n; row++)
             	{
                   	sum += matrix[row][col];
             	}
             	if (sum != magicConstant)
             	{
                   	return false;
             	}
        	}

        	int rightDiagonal = 0;
        	int leftDiagonal = 0;
        	for (int i = 0; i < n; i++)
        	{
             	rightDiagonal += matrix[i][i];
             	leftDiagonal += matrix[i][n - i - 1];
        	}

        	return rightDiagonal == magicConstant && leftDiagonal == magicConstant;
        }

    @Override
    public int[][] getMatrix() {
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


