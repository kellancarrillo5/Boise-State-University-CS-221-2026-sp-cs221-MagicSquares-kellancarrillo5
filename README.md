****************
* Warmup / MagicSquares
* CS 221
* 1/12/26
* Kellan Carrillo
**************** 

OVERVIEW:

MagicSquare is a command-line based program that creates or checks a magic square. A (n x n) matrix of integers contains the values from 1, 2, 3, … n^2. The total of each of the diagonals, rows and columns all equal the magic number. With the create function, the program receives user input specifying a file name and matrix length(n). It then generates a file with the provided name and writes a generated magic square to the file. The check function recieves a given filename and stores the data in a 2D array. Then the 2D array is manipulated to check if it was a valid magic square. For both functions of the program the user is displayed the results.  


INCLUDED FILES:

 * MagicSquare.java - Implements MagicSquareInterface to read, create, evaluate and display a magic square
 * MagicSquareInterface.java - source file contaning the methods implemented in MagicSquare.java
 * MagicSquareDriver.java - Driver class for Magic Square, takes command-line arguements to create or check magic squares
 * MagicSquaresTest.java - Tester class
 * README - this file


COMPILING AND RUNNING:

 Give the command for compiling the program, the command
 for running the program, and any usage instructions the
 user needs.
 
 These are command-line instructions for a system like onyx.
 They have nothing to do with Eclipse or any other IDE. They
 must be specific - assume the user has Java installed, but
 has no idea how to compile or run a Java program from the
 command-line.
 
 e.g.
 From the directory containing all source files, compile the
 driver class (and all dependencies) with the command:
 $ javac MagicSquareDriver.java

 Run the compiled class file with the command:
 $ java MagicSquareDriver

 Console output will give the results after the program finishes.


PROGRAM DESIGN AND IMPORTANT CONCEPTS:

MagicSquare implements MagicSquareInterface, which defines the outlining methods for the program. MagicSquare manages the set elements in the 2D array storing the magic square. The 2D array contains unique values that total to the given number, n, known as the magic number. The magic number can also be found with this equation n(n^2 + 1) / 2. Additionally all other non-implemented methods and constructors required are described in the interface. This includes an overloaded magic square constructor, writeMatrix(), and readMatrix(). To create the magic square constructor we were provided the psuedo code in the project desctiption. The results from either check or create are printed to the user.   

The driver class, MagicSquareDriver, receives command line arguments. This checks whether the user asks for -check or -create. The command line arguments are verified by checking if the given number is positive and odd, the correct amount of arguments were given for check and create, and if the file name exists. If the program is used incorrectly it will display a usage statement. 


TESTING:

 MagicSquareTest was my main form of testing for MagicSquare. The tester was provided correct and incorrect files to check and squares to generate. 


Scenarios being tested in MagicSquareTest included:
	Four incorrect files to check 
	Four correct files to check
	All methods inherited from MagicSquareInterface
    Handling exceptions being thrown
	
All the tests are currently passing without errors. Additionally I used toString() to test make sure I was capturing the correct data periodically.  


DISCUSSION:
 
Starting with coding this semester was a challenge for me. I had to spend some time reviewing concepts from CS121, however this was a good assignment to get me thinking in a coding perspective again. Writing code still takes me awhile because the commands aren’t memorized for me yet. But with the help of the slides and previous example projects in CS121 I was able to find examples of just what I was looking for.

A new concept for me was using a usage statement. Luckily the google doc linked in the project description was quite helpful. Additionally I had to google a few more examples to ensure I was writing what I intended to display. Another topic I had to google was how to append a tab space to a string. I had remembered how to get a new line, but for formatting purposes using tab was ideal. With a quick article on escape sequences I found a helpful example using the tab. 

One major issue I discovered was with my scanners. In readMatrix(), I kept recieving an error with a fileNotFoundException. As it turned out I needed to close my scanners before the exception was thrown. I had received help with this in the kount learning center, clarifying this idea for me. Overall this project was a good refresher from last semester and brought me back to how to start a project.
