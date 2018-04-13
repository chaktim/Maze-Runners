/** 
   MazeSolver

   Recursively goes through a maze to find treasure if there is any

   -Drop walls on used path
   -Create snapshots
   -Backtrack when no path available

*/
public class MazeSolver {

    //for now, public
    public Maze mazeToBeSolved;
    
    public MazeSolver (Maze maze) {
    //not sure if this is needed
    //throws java.io.FileNotFoundException {
	mazeToBeSolved = new Maze(maze);
    }

    public String toString(){
	if (solve()) return mazeToBeSolved.toString();
	else return "no solution";
    }
    
    private boolean onTreasure() {
        return mazeToBeSolved.explorerIsOnA() == 0;
    }
    private boolean onWall() {
       return mazeToBeSolved.explorerIsOnA() == 1;
    } 

    public boolean solve() {
	//base case
        if (onTreasure()) return true;
	else {
	    //move foward, one direction at a time
	    for(int direction = 1; direction <= 8; direction*=2) {
		Maze snapshot = new Maze(mazeToBeSolved);

		//drop wall to prevent infinite loop
		mazeToBeSolved.dropA(1);

		//move foward
		mazeToBeSolved.go(direction);

		//TEST
		// System.out.println(snapshot + "snapshot");
		// System.out.println(mazeToBeSolved + "current" + direction);
		
		//if on wall, backtrack using snapshot
		if(onWall()) {
		    mazeToBeSolved = snapshot;
		    if(direction == 8) return false;
		}
		//otherwise, continue on this path (recursive)
		else if(solve()) return true;
		else mazeToBeSolved = snapshot;
	    }
	}
	return false;
    }
}
		    
		

