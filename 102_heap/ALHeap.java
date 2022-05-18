/*
uwu kittens: Anthony Sun, Ivina Wang, Jaylen Zeng
APCS pd 7
HW102-- Heap On Heapin' On
2022-05-18w
time spent: .5 hrs
*/
/*
DISCO:
* math is cool :)
* a heap can be **mapped onto** an ArrayList!! :D

QCC:
* How can we remove an element thats not the min? :\
* Can we map a heap onto other collections? ✽-(ˆ▽ˆ)/✽ 
* How do we code ALHeap to work with equal elements?
*/

/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */

import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
    _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
    String ret = "";
    //easy way
    for (int i : _heap) {
      ret += i + " ";
    }
    return ret;
  }//O(n)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
    return _heap.size() == 0;
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
    return _heap.get(0);
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * add the element to the end of the ArrayList,
   * while the value added is less than the parent, swap
   */
  public void add( Integer addVal )
  {
    _heap.add(addVal);
    while (addVal < _heap.get(getParentIndex(addVal))) { // if root, gets itself
      swap(_heap.indexOf(addVal), getParentIndex(addVal));
    }
  }//O(n)

  private int getParentIndex(int val) {
    int valIndex = _heap.indexOf(val);
    return (valIndex - 1)/2;
  }
  
  private int getLeftChildIndex(int pos) {
    return 2 * pos + 1;
  }

  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * Swap element you want to remove with last element
   * Remove new last element (now the one you want to remove)
   * Reheap (compare left and right child of element. If parent is bigger than child, swap. Keep going until no swap or you can't anymore)
   */
  public Integer removeMin()
  {
    if (isEmpty()){
      return null;
    }
    int removed = _heap.get(0);
    _heap.set(0, _heap.get(_heap.size()-1));
    _heap.remove(_heap.size()-1);
    int pos = 0;
    
    while (minChildPos(pos) != -1 && _heap.get(pos) > _heap.get(minChildPos(pos))){
      swap(pos, minChildPos(pos));
      pos = minChildPos(pos);
    }
    return (Integer) removed;
    
  }//O(n)


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    int leftChild = getLeftChildIndex(pos);
    int rightChild = leftChild+1;
    if (leftChild >= _heap.size()) { // no children
      return -1;
    }
    if (leftChild >= _heap.size()-1) { // only child
      return leftChild;
    }
    if (_heap.get(leftChild) < _heap.get(rightChild)) return leftChild;
    return rightChild;
  }//O(1)


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );	
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //main method for testing
  public static void main( String[] args )
  {
      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap
