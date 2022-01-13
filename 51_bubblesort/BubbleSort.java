// Anthony Sun + Corn; Nakib Abedin + Joker
// APCS pd06
// HW51 -- implementing bubblesort
// 2022-01-04
// time spent: 1.0 hr

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * 1) Create the bubble. Start from one end (in this case, index 0). Set n=0 and set the bubble as n and n+1.
 * 2) If n>n+1, swap the values. Then increment n by one and repeat until you reach the end of the list.
 * 3) Check if the list is sorted (if there are no swaps after one complete iterationm then it must be sorted).
 *
 * DISCO
 * 1) Bubble sort is much more efficient than the algoritms we used to sort in introCS.
 * 2) You need one less pass than the length of the collection.
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: The collection is sorted
 * q1: After pass p, what do you know?
 * a1: p items in the list are in the correct position
 * q2: How many passes are necessary to completely sort?
 * a2: one less than the length of the collection
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    for (int x = data.size()-1; x > 0; x--) {
      for (int i = 0; i < x; i++) {
        if (data.get(i).compareTo(data.get(i+1))>0) {
	  data.set(i, data.set(i+1, data.get(i)));
        }

      }
    }


  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    ArrayList<Comparable> data = new ArrayList<Comparable>();
    for (int i = 0; i < input.size(); i++) {
      data.add(input.get(i));

    }
    for (int x = data.size()-1; x > 0; x--) {
      for (int i = 0; i < x; i++) {
        Comparable n = data.get(i);
        Comparable m = data.get(i+1);

        if (n.compareTo(m)>0) {
          data.set(i+1, n);
          data.set(i, m);
        }

      }
    }
    return data;
  }


  public static void main( String [] args )
  {
    /*===============for VOID methods=============
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      ============================================*/

      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      //System.out.println( coco );
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class BubbleSort
