# Maze-Runners

## personnel
### Bentley Dong & Chaktim Wong

## statement of problem
### To determine the correct path/s to treasure in a given maze if
### there are any.

## recursive abstraction
### When I am asked to find a path(s) to treasure in a given maze,
### the recursive abstraction can determine if a path in an intersection leads
### to treasure while not crossing any previous paths.

## base case
### End of path or treasure discovered

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