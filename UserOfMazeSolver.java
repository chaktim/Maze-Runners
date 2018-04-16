/**
  Test MazeSolver class.
  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting
  For example,
      java UserOfMazeSolver mazes/4cell_treasureWest.txt -1 -1  # no explorer
 */

public class UserOfMazeSolver {
    private static Displayer displayer;

    public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
        System.out.println();

        Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );

    MazeSolver mazeSolver = new MazeSolver(maze);
	System.out.println(mazeSolver.solutions);
	
        System.out.println( maze
			    + System.lineSeparator()
			    + mazeSolver.isSolved()
			    + System.lineSeparator()
			    + mazeSolver.solvedMaze);

    }
}