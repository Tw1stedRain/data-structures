# Quick Sort

## Learning Objectives

Learn how to build and implement a simple Quick Sort.

## Lecture Flow

* Show the students the given video

* walk through the steps of the sort at a slower pace

* explain the recursion and why it's necessary


## Diagram

[Quick Sort Diagram](https://upload.wikimedia.org/wikipedia/commons/8/84/Lomuto_animated.gif)

## Algorithm

1. Pick an element, called a pivot, from the array.

2. Partitioning: reorder the array so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way). After this partitioning, the pivot is in its final position. This is called the partition operation.

3. Recursively apply the above steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values. 

## Pseudocode

    quicksort(A, lo, hi) is
    if lo < hi then
        p := partition(A, lo, hi)
        quicksort(A, lo, p - 1)
        quicksort(A, p + 1, hi)
        
    partition(A, lo, hi) is
        pivot := A[hi]
        i := lo
        for j := lo to hi - 1 do
            if A[j] < pivot then
                swap A[i] with A[j]
                i := i + 1
        swap A[i] with A[hi]
        return i
  
      
## Readings and References

### Watch

[Quick Sort Video](https://youtu.be/PgBzjlCcFvc)
 
    GeeksforGeeks


### Read

* [Article 1](https://www.geeksforgeeks.org/quick-sort/)

* [Article 2](https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/)
