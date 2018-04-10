# Maze-Runners

## personnel
### Bentley Dong & Chaktim Wong

## statement of problem
### Determine the boolean value of the statement,
### "There is at least one correct path in a given maze
### to the treasure."

## recursive abstraction
### When I am asked to find a path(s) to treasure in a given maze,
### the recursive abstraction can determine a legal path
### ahead that leads to treasure if there is any.

## base case
### No more paths to take or treasure has been found

## English or pseudocode description of algorithm

### if no paths available
       go back to snapshot
    else
	if multiple paths ahead
	   save snapshot
	   set direction to an untaken path /*use a variable
	   to remember which paths were taken?*/
	   
	move foward
	if treasure?
	   ~save/record
	invoke recursive abstraction
	if treasure found (undetermined)
	else (no path to treasure on maze)

## class(es), with fields and methods

## version*n* wish list