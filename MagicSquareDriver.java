/**
 * Driver class for Magic Square
 * @author kellancarrillo5
 */

public class MagicSquareDriver {
    public static void main(String[] args) {
        //instance variables
        private String selectedOption;
        private int givenSize;
        private String fileName;

         //display to the command line the selections avaliable, -check or -create
        //System.out.println("java MagicSquareDriver <-check | -create> <filename> < |size>");
         
        //if command line == 2 arguements (-check)
        if(args.length == 2){

        }
        
        //if command line has 3 arguments (-create)
        return;
        }
    }
   
    //new int file made


    //scanner for command line, look for -check and -create

    //Method to check if the 

    /**
     * Constructor to create a magic square
     * @param fileName : input fileName 
     * @param givenSize : set col/row size of the 2D magicSquare
     */
    public MagicSquare(fileName, givenSize){
        //update instance variables 
        this.fileName = args[1];
        this.selectedOption = args[0];
        this.givenSize = parseInt(args[3]);

        //check that size is an odd positive integer (size is not the magic number its length for 2D array)
        if(givenSize / 2 == 0 || givenSize < 0){
            System.out.println("Selected size must be an odd positive integer, try again.");
        } else {

        }

        }
        //printwriter?


    }

    /**
     * Constructor to check if a file is a valid magic square
     * @param fileName : input fileName
     */
    public MagicSquare(fileName){
        //update instance varibales

        //
    }

   
    
}

