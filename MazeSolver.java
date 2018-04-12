/** 
   MazeSolver

   Recursively goes through a maze to find treasure if there is any

   -Drop walls on used path
   -Create snapshots
   -Backtrack when no path available

*/



public class MazeSolver {

    public MazeSolver ( String sourceFilename
               , int explorerRank, int explorerFile
               ) throws java.io.FileNotFoundException {
	Maze mazeToBeSolved = new Maze(sourceFilename, explorerRank, explorerFile);
    }
