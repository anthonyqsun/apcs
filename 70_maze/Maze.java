// uwu kittens (Jaylen Zeng, Anthony Sun, Ivina Wang)
// APCS pd7
// HW70 -- Thinkers of the Corn
// 2022-03-03r
// time spent: 1 hr

/***
 * SKEELTON for
 * class MazeSolver
 * Implements a blind depth-first exit-finding algorithm.
 * Displays probing in terminal.
 * 
 * USAGE: 
 * $ java Maze [path/to/mazefile]
 * (mazefile is ASCII representation of a maze, using symbols below)
 *
 * ALGORITHM for finding exit from starting position:
 *  From the starting position, find a possible move on the PATH in this order: up, right, left down.
 *  In other words, if there is a possible move in all 4 directions, up will always be chosen.
 *  Once a position is reached where the HERO cannot move (usually because of a dead-end), 
 *  return to a position where a move is possible. 
 *  During this process, replace spaces that have no moves with VISITED_PATH
 *  Repeat until EXIT is reached. 
 *
 * DISCO
 * This was pretty similar to the Knight's tour problem, and so we were able to use pretty much the same implementation.
 * QCC
 * How can we make sure the character reaches the exit? That is, what happens if the character starts in a spot that doesn't connect to the exit?
 ***/

//enable file I/O
import java.io.*;
import java.util.*;


class MazeSolver
{
  final private int FRAME_DELAY = 50;

  private char[][] _maze;
  private int h, w; // height, width of maze
  private boolean _solved;

  //~~~~~~~~~~~~~  L E G E N D  ~~~~~~~~~~~~~
  final private char HERO =           '@';
  final private char PATH =           '#';
  final private char WALL =           ' ';
  final private char EXIT =           '$';
  final private char VISITED_PATH =   '.';
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public MazeSolver( String inputFile )
  {
    // init 2D array to represent maze
    // (80x25 is default terminal window size)
    _maze = new char[80][25];
    h = 0;
    w = 0;

    //transcribe maze from file into memory
    try {
      Scanner sc = new Scanner( new File(inputFile) );

      System.out.println( "reading in file..." );

      int row = 0;

      while( sc.hasNext() ) {

        String line = sc.nextLine();

        if ( w < line.length() )
          w = line.length();

        for( int i=0; i<line.length(); i++ )
          _maze[i][row] = line.charAt( i );

        h++;
        row++;
      }

      for( int i=0; i<w; i++ )
        _maze[i][row] = WALL;
      h++;
      row++;

    } catch( Exception e ) { System.out.println( "Error reading file" ); }

    //at init time, maze has not been solved:
    _solved = false;
  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, ESC
    //emacs shortcut: M-x quoted-insert, ESC

    int i, j;
    for( i=0; i<h; i++ ) {
      for( j=0; j<w; j++ )
        retStr = retStr + _maze[j][i];
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
   * void solve(int x,int y) -- recursively finds maze exit (depth-first)
   * @param x starting x-coord, measured from left
   * @param y starting y-coord, measured from top
   **/
  public void solve( int x, int y )
  {
    delay( FRAME_DELAY ); //slow it down enough to be followable

    //primary base case
    if ( _solved ) {
        System.exit(0);
    }
    //other base cases
    else if ( _maze[x][y] == EXIT ) {
        _solved = true;
        System.out.println(this);
        return;
    }
    else if ( !onPath(x, y) ) {
        return; 
    }
    //otherwise, recursively solve maze from next pos over,
    //after marking current location
    else {
      _maze[x][y] = HERO;
      System.out.println(this); // refresh screen
      
      solve(x, y - 1);
      solve(x + 1, y);
      solve(x, y + 1);
      solve(x - 1, y);
      
      //prevents unnecessary backtracking if last move before exit was left.
      if (_solved) {
          solve(x,y);
      }
      
      //If you get here then there are no more possible moves / you reached a dead end.
      _maze[x][y] = VISITED_PATH;
      System.out.println( this ); //refresh screen
    }
  }

  //accessor method to help with randomized drop-in location
  public boolean onPath( int x, int y) {
      return (_maze[x][y] == EXIT || _maze[x][y] == PATH);
  }

}//end class MazeSolver


public class Maze
{
  public static void main( String[] args )
  {
    String mazeInputFile = null;

    try {
      mazeInputFile = args[0];
    } catch( Exception e ) {
      System.out.println( "Error reading input file." );
      System.out.println( "USAGE:\n $ java Maze path/to/filename" );
    }

    if (mazeInputFile==null) { System.exit(0); }

    MazeSolver ms = new MazeSolver( mazeInputFile );

    //clear screen
    System.out.println( "[2J" );

    //display maze
    System.out.println( ms );

    //drop hero into the maze (coords must be on path)
    // ThinkerTODO: comment next line out when ready to randomize startpos
    //ms.solve( 4, 7 );
    
    //drop our hero into maze at random location on path
    int startX = (int) Math.random() * 80;
    int startY = (int) Math.random() * 25;
    //reroll if not on path
    while (!ms.onPath(startX, startY)) {
        startX = (int) (Math.random() * 80);
        startY = (int) (Math.random() * 25);
    }
    ms.solve( startX, startY );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class Maze
