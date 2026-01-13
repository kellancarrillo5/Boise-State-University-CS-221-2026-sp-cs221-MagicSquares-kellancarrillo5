/**
 * Driver class for Magic Square
 * 
 * @author kellancarrillo5
 */

public class MagicSquareDriver {
    // instance variables
    private String selectedOption;
    private int givenSize;
    private String fileName;
    private int[][] magicSquare;
    private int row;
    private int col;

    public static void main(String[] args) {
         //display to the command line the selections avaliable, -check or -create
        System.out.println("java MagicSquareDriver <-check | -create> <filename> < |size>");
         
        //if command line == 2 arguements (-check)
        if(args.length == 2){

        }
        
        //if command line has 3 arguments (-create)

        /**
        * Constructor to create a magic square
        * @param fileName : input fileName 
        * @param givenSize : set col/row size of the 2D magicSquare
        */
        public MagicSquare(String fileName, int givenSize){
            //initialize instance variables 
            this.givenSize = parseInt(args[3]);
            magicSquare = new int[givenSize][givenSize];
            this.row = givenSize - 1; 
            this.col = givenSize / 2;

            
            this.fileName = args[1];
            this.selectedOption = args[0];
            
            //check that size is an odd positive integer (size is not the magic number its length for 2D array)
            if(givenSize / 2 == 0 || givenSize < 0){
                System.out.println("Selected size must be an odd positive integer, try again.");
            } else {
            //printwriter?
            }
        }

        /**
        * Constructor to check if a file is a valid magic square
        * @param fileName : input fileName
        */
        public MagicSquare(fileName){
            //update instance varibales
            //
        }

        return;
        }

    }


    // new int file made

    // scanner for command line, look for -check and -create

    // Method to check if the
