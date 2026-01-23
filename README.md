****************
* Warmup / MagicSquares
* CS 221
* 1/12/26
* Kellan Carrillo
**************** 

OVERVIEW:

 MagicSquare is a command-line based program that allows the user to check or create a magic square. With the check function, the program recieves a given file name. It then checks if the magic square is truely a magic square and returns the results to the user. Additionally the create function recieves a file name and magic number, then creating and writing the new magic square to the file.


INCLUDED FILES:

 * MagicSquare.java - Implements MagicSquareInterface
 * MagicSquareInterface.java - source file contaning the methods implemented in MagicSquare.java
 * MagicSquareDriver.java - Driver class, taking in 
 * MagicSquareTester.java - Tester made by our instructor
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


 This is the sort of information someone who really wants to
 understand your program - possibly to make future enhancements -
 would want to know.

 Explain the main concepts and organization of your program so that
 the reader can understand how your program works. This is not a repeat
 of javadoc comments or an exhaustive listing of all methods, but an
 explanation of the critical algorithms and object interactions that make
 up the program.

 Explain the main responsibilities of the classes and interfaces that make
 up the program. Explain how the classes work together to achieve the program
 goals. If there are critical algorithms that a user should understand, 
 explain them as well.
 
 If you were responsible for designing the program's classes and choosing
 how they work together, why did you design the program this way? What, if 
 anything, could be improved? 

TESTING:

 MagicSquareTest was my main form of testing for MagicSquare. The tester was provided correct and incorrect files to check and squares to generate. 


Scenarios being tested in MagicSquareTest included:
	Three incorrect files to check 
	Three correct files to check
	All methods inherited from MagicSquareInterface
    Handling exceptions being thrown
	
All the tests are currently passing without errors.


DISCUSSION:
 
Starting with coding this semester was a challenge for me. I had to spend some time reviewing concepts from CS 121, however this was a good assignment to get me thinking in a coding perspective again. Coding still takes me a while because the commands aren’t easily remembered yet. However with the slides and previous example projects in 121 I was able to find examples of just what I was looking for.

A new concept for me was using a usage statement. Luckily the google doc linked in the project description was quite helpful. Additionally I had to google a few more examples to ensure I was writing what I intended to display. Another topic I had to google was how to append a tab space to a string. I had remembered how to get a new line, but for formatting purposes using tab was ideal. 

One major issue I discovered was with my scanners. I had closed them within where they were being used, preventing the scanners from functioning. Fixing this bug had allowed many of my failing tests to be resolved. Overall this project was a good refresher from last semester and will surely help me with specific examples in the future.
