/** 
   MazeSolver
   Recursively goes through a maze to find treasure if there is any
   -Drop walls on used path
   -Create snapshots
   -Backtrack when no path available
*/

import java.util.ArrayList;

public class MazeSolver {

    //for now, public
    public Maze mazeToBeSolved;
    public Maze solvedMaze;
    public ArrayList<Maze> solutions;
    
    public MazeSolver (Maze maze) {

	mazeToBeSolved = new Maze(maze);
	solutions = new ArrayList<>();

    }

    public String toString(){
		return solvedMaze.toString() + isSolved();
		
    }

    private void solve(Maze maze) {
	
	//base case
        if (maze.onTreasure()) {
            solvedMaze = maze; mazeToBeSolved = maze;
            solutions.add(maze);
        }

	else {
        // debugging
		System.out.println(maze);

	    // move foward, one direction at a time
	    for(int direction = 1; direction <= 8; direction*=2) {
        Maze snapshot = new Maze(maze);

        // drop wall to prevent infinite loop
        maze.dropA(1);

        // move foward
        maze.go(direction);
		
        //if on wall, backtrack using snapshot
        if (maze.onWall()) {
            maze = snapshot;
            if (direction == 8) {break;}
		}
		// otherwise, continue on this path (recursive)
		else solve(maze); maze = snapshot;
	    }
	}

    }

    public boolean isSolved() {
        solve(mazeToBeSolved);
        return mazeToBeSolved.onTreasure();
    }

}
		    
		
