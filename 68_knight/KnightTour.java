// Clyde Sinclair
// APCS pd0
// HW68 -- recursively probing for a closed cycle
// 2022-02-28m
// time spent:  hrs

  /***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO
 *
 * DISCO
 *
 * QCC
 *
 * Mean execution times for boards of size n*n:
 * n=5   __s    across __ executions
 * n=6   __s    across __ executions
 * n=7   __s    across __ executions
 * n=8   __s    across __ executions
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 8;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "[2J" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    //int startX = 2 + (int) (Math.random() * 8);
    //int startY = 2 + (int) (Math.random() * 8);
    //tf.findTour( startX, startY, 1 );   // 1 or 0 ?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n+4;

    //init 2D array to represent square board with moat
    _board = new int[_sideLength][_sideLength];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    for (int i = 0; i < _sideLength; i++) {
      for (int j = 0; j < _sideLength; j++) {
        if ((i < 2 || i > n+1) || (j < 2 || j > n+1)) {
          _board[j][i] = -1;
        }
      }
    }
    //---------------------------------------------------------

  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength; i++ ) { // TODO modified
      for( j=0; j < _sideLength; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/
  public void findTour( int x, int y, int moves )
  {
    // delay(1); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if ( _solved) System.exit(0);

    //primary base case: tour completed
    if ( moves == _board.length*_board.length) {
      _solved = true;
      System.out.println( this ); //refresh screen
      return;
    }
    //other base case: stepped off board or onto visited cell
    if ( _board[x][y] != 0) {
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] = moves;

      System.out.println( this ); //refresh screen

      // delay(2); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/
      int yCor=0;
      int xCor=0;
      boolean valid = true;
      int option = 0;
      if (_board[x+1][y+2] == 0) {
        option = 0;
      }
      else if (_board[x+2][y+1] == 0) {
        option = 1;
      }
      else if (_board[x+2][y-1] == 0) {
        option = 2;
      }
      else if (_board[x+1][y-2] == 0) {
        option = 3;
      }
      else if (_board[x-1][y-2] == 0) {
        option = 4;
      }
      else if (_board[x-2][y-1] == 0) {
        option = 5;
      }
      else if (_board[x-2][y+1] == 0) {
        option = 6;
      }
      else if (_board[x-1][y+2] == 0) {
        option = 7;
      }
      else {
        valid = false;
      }
      if (valid) {
        int[] coords = choice(option, x, y);
        findTour(coords[0], coords[1], moves+1);
        for (int a = option; a < 7; a++) {
          coords = choice(a+1, x, y);
          findTour(coords[0], coords[1], moves+1);
        }
      }
      
      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
      _board[x][y] = 0;

      // System.out.println( this ); //refresh screen
    }
  }//end findTour()
  
  public int[] choice(int option, int x, int y) {
    int xCor = 0;
    int yCor = 0;
    int[] arr = new int[2];
    if (option == 0) {
      xCor = x+1;
      yCor = y+2;
    }
    else if (option == 1) {
      xCor = x+2;
      yCor = y+1;
    }
    else if (option == 2) {
      xCor = x+2;
      yCor = y-1;
    }
    else if (option == 3) {
      xCor = x+1;
      yCor = y-2;
    }
    else if (option == 4) {
      xCor = x-1;
      yCor = y-2;
    }
    else if (option == 5) {
      xCor = x-2;
      yCor = y-1;
    }
    else if (option == 6) {
      xCor = x-2;
      yCor = y+1;
    }
    else if (option == 7) {
      xCor = x-1;
      yCor = y+2;
    }
    arr[0] = xCor;
    arr[1] = yCor;
    return arr;
    
  }

}//end class TourFinder
