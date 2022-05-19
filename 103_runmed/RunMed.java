/*
uwu kittens: Anthony Sun, Ivina Wang, Jaylen Zeng
APCS pd 7
HW103 -- Minheap Maxheap Median
2022-05-19r
time spent: 1 hrs
*/

/*
DISCOWO:
* our output was 499999.5 for the median
* runtime for getMedian is O(1)
* runtime for add(newVal) is O(logn)

QT>.<CC:
* why does the assignment page have RunMed.algo but not RunMed.java?
* why is hugo not a fan/friend of erica??!!!!?!

ALGO for RunMed
* If the next value is less than the root of the maxheap, add it to maxheap. Else add to minheap
* Balance the heaps by removing from larger heap and add
* Find the median. If the heap sizes are equal, median is the mean of the roots. If they are not equal then the median is the root of the heap with the larger size.
*/

import java.util.NoSuchElementException;

public class RunMed {
    ALHeapMax lilVals;
    ALHeapMin bigVals;
    
    public RunMed() {
        lilVals = new ALHeapMax();
        bigVals = new ALHeapMin();
    }
    
    public Integer getMedian() throws NoSuchElementException {
        if (lilVals.getSize() == 0) {
            throw new NoSuchElementException();
        }
        if (lilVals.getSize() == bigVals.getSize()) {
            return (lilVals.peekMax() + bigVals.peekMin()) / 2;
        }
        else if (lilVals.getSize() > bigVals.getSize()) {
            return lilVals.peekMax();
        }
        return bigVals.peekMin();
    }
    
    public void add(Integer newVal) {
        //if added element is first one we ever see
        if (lilVals.isEmpty()){
            lilVals.add(newVal);
            return;
        }
        //adds when MaxHeap has a root.
        if (newVal < lilVals.peekMax()){
            lilVals.add(newVal);
        } else {
            bigVals.add(newVal);
        }
        //balances heaps
        while (Math.abs(lilVals.getSize() - bigVals.getSize())  >= 2){
            if (lilVals.getSize() > bigVals.getSize()){
                bigVals.add(lilVals.removeMax());
            } else {
                lilVals.add(bigVals.removeMin());
            }
        }
    }
}
