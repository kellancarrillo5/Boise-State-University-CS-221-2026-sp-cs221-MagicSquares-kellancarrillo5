import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Driver class for Magic Square, 
 * 
 * @author kellancarrillo5
 */

public class MagicSquareDriver {
    public static void main(String[] args){
       
        //validate arguements, if there is nothing or to much typed we will display the usage explaining what commands to type
        if(args.length < 2 || args.length > 3){
            printUsage();
            return; 
        }

        String flag = args[0];
        String fileName = args[1];

        /////////
        //CHECK//
        /////////
        if(flag.equals("-check")){
            if(args.length != 2){ //must have two arguements
                System.out.println("Error: -check flag requires exactly 2 arguments.");
                printUsage();
                return;
            }

            try{           
                //Read and check the magic square from the file
                MagicSquare square = new MagicSquare(fileName);
                System.out.println(square.toString());
            } catch(FileNotFoundException e){
                //if the file is not found notify the user
                System.out.println("Error: File '" + fileName + "' not found or cannot be opened.");
                System.out.println("Make sure the file exists and is in the correct format.");
            }
        }
            
        //////////
        //CREATE//
        //////////              
        else if(flag.equals("-create")){
            if(args.length != 3){ //if it doesn't have the correct amount of arguments
                System.out.println("Error: -create flag requires exactly 3 arguments.");
                printUsage();
                return;
            }
            try{
                int size = Integer.parseInt(args[2]);

                //check if size is valid
                if(size <= 0 || size % 2 == 0){
                    System.out.println("Size must be an odd, positive integer!");
                    printUsage();
                    return;
                    } 
                //create the new magic square and print to string   
                MagicSquare square = new MagicSquare(fileName, size);
                System.out.println(square.toString());

                } catch (NumberFormatException e){
                    System.out.println("Error: Size must be a valid integer.");
                } catch (IOException e){
                  System.out.println("Error: Issue writing to file");
               }
        } else {
            printUsage();
        }
      }

    /**
     * Prints for incorrect command line input
     */
    private static void printUsage(){
        System.out.println("Usage:");
        //display to the command line how to correctly use -check and -create
        System.out.println("java MagicSquareDriver <-check | -create> <filename> < |size>");
        System.out.println("java MagicSquareDriver -check <filename>     will check if a file contains a magic square");
        System.out.println("java MagicSquareDriver -create <filename <size>     will create a file with the name provided and create a magic square of a given odd, positive size.");

    }
}

    
         
       
           
