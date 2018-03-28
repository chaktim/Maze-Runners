# Maze-Runners

## personnel
### Bentley Dong & Chaktim Wong

## statement of problem
### Return the boolean value of the statement,
### "There is at least one correct path in a given maze
### to the treasure" and save that path.

## recursive abstraction
### When I am asked to find a path(s) to treasure in a given maze,
### the recursive abstraction can determine if a path in an intersection leads
### to treasure while not crossing any previous paths.

## base case
### End of path

## English or pseudocode description of algorithm
### if end of path
    if treasure
    	save path
    else (remove path?)
### else //recursive
    for each path in an intersection
    	go down the path until intersection
	if path is legal
	    invoke recursive abstraction via this method
	set current point to previous checkpoint/intersection?
    return

## class(es), with fields and methods

## version*n* wish list