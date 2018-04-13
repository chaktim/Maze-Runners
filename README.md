# Maze-Runners

## personnel
### Bentley Dong & Chaktim Wong

## statement of problem
### Determine the boolean value of the statement,
### "There is at least one correct path in a given maze
### to the treasure."

## recursive abstraction
### When I am asked to find a path(s) to treasure in a given maze,
### the recursive abstraction can check the next square and all the squares
### after it for treasure if there is any.

## base case
### Treasure has been found

## English or pseudocode description of algorithm

### if treasure has been found (return true)
    else
	for loop, check adjacent squares one by one
	   save snapshot, and drop wall at explorer location
	   move explorer to adjacent square
	   check for wall on current square
	   if wall? backtrack (use snapshot)
	   otherwise invoke recursive abstraction

	   set maze to snapshot after all the recursive calls finish

	once all paths checked, return false

## class(es), with fields and methods

## version*n* wish list
### Multiple solutions
### More efficient code (repeat less code, more versatile, etc.)
### Clearer maze prints (terminal/cmd maze displays)
###

## known bugs
### Does not work if explorer is set outside of maze