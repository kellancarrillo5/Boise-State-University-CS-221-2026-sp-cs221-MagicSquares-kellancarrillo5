/**
 * Driver class for Magic Square, 
 * 
 * @author kellancarrillo5
 */

public class MagicSquareDriver {
    public static void main(String[] args) {
        //instance variables
        String flag = args[0];
        String fileName = args[1];
        int size = Integer.parseInt(args[2]);

        //validate arguements, if there is nothing or to much typed we will display the usage explaining what commands to type
        if(args.length < 2 || args.length > 3){
            printUsage();
            return; 
        }

        try{
            /////////
            //CHECK//
            /////////
            if(flag.equals("-check")){
                if(args.length != 2){ //must have the file name
                    printUsage();
                    return;
                }
            

            //Read and check the magic square from the file
            MagicSquare square = new MagicSquare(fileName);
            System.out.println(square.toString());
            
            //////////
            //CREATE//
            //////////              
            }else if(flag.equals("-create")){
                if(args.length != 3){ //must have the filename and size
                    printUsage();
                    return;
                }
                try{
                    fileName = args[1];
                    size = Integer.parseInt(args[2]);
                } catch (numberFormatException e){

                }
                if(size <= 0 || size % 2 == 0){
                    System.out.println("Size must be an odd, positive integer!");
                    printUsage();
                    return;
                } 
                MagicSquare square = new MagicSquare(fileName, size);
                System.out.println(square.toString());
            }
        
        }
    }

    /**
     * 
     */
    private static void printUsage(){
        System.out.println("Usage:");
        //display to the command line the selections avaliable, -check or -create
        System.out.println("java MagicSquareDriver <-check | -create> <filename> < |size>");
        System.out.println("java -check <filename>     will check if a file contains a magic square");
        System.out.println("java -create <filename <size>     will create a file with the name provided and create a magic square of a given odd, positive size.");

    }
}

    
         
       
           
