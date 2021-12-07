/*
NYAH: Hugo Jenkins + Boary, Anthony Sun + Corn, Nakib Abedin + Joker
APCS
HW43 - skeleton of SuperArray
2021-12-06
time spent: 0.5 hrs

DISCO:
0. _size should be changed when the length of _data changes
1. the "_" indicates something is an instance variable

QCC:
0. How will we use expand() in the future
1. why does expand() double the length of the array
*/

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = _data.length;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String s = "[";
    for (int e : _data) {
        s +=e +",";
    }

    return s.substring(0,s.length()-1)+"]";
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] data2 = new int[_size];

    for (int i = 0; i < _size; i++) {
      data2[i] = _data[i];
    }
    _data = new int[_size*2];
    for (int i = 0; i < data2.length; i++) {
      _data[i] = data2[i];
    }
    _size = _data.length;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int i = _data[index];
    _data[index] = newVal;
    return i;
  }


  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
    /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~

      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class