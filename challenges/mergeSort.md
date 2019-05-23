# Merge Sort

## Learning Objectives

Learn how to build and implement a simple Merge Sort.

## Lecture Flow

* Show the students the given video

* walk through the steps of the sort at a slower pace

* explain the recursion and why it's necessary 


## Diagram

![Merge Sort Diagram](assets/msDiagram.png)

## Algorithm

* separate the given array in half

* recursively call the merge sort on the first half

* recursively call the merge sort in the second half

* merge the two halves together

## Pseudocode

    If Array contains only one element Then
     Return Array
    Else
     Middle= ((Last + First)/2) rounded down to the nearest integer
     LeftHalfArray = MergeSort(Array(First..Middle)) 
     RightHalfArray = MergeSort(Array(Middle+1..Last)) 
     ResultArray = Merge(LeftHalfArray, RightHalfArray) 
     Return ResultArray
      
## Readings and References

### Watch

[Merge Sort Video](https://youtu.be/JSceec-wEyw)
 
    GeeksforGeeks


### Read

* [Article 1](https://users.cs.jmu.edu/bernstdh/web/common/lectures/summary_sorting_mergesort.php)

* [Article 2](https://www.geeksforgeeks.org/merge-sort/)
