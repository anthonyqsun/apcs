/*
NYAH: Hugo Jenkins + Boary, Anthony Sun + Corn, Nakib Abedin + Joker
APCS
HW44 - Refactored SuperArray
2021-12-07
time spent: 0.5 hrs

DISCO:
0. Write "2" instead of "two" for indexes.
1. _size takes the value of the meaningful size of the array.
2. The reason our default size is 10 because it is a good balance to avoid allocating too much or too little memory.

QCC:
0. Expanded array only needs to be run once.
1. How will users access the length of the array encapsulated by SuperArray?

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
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    if (_size == 0) {
      return "[]";
    }
    String s = "";
    for (int i = 0; i < _size; i++) {
        s += "," + _data[i];
    }
    return "[" + s.substring(1)+"]";
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
    if (index > _size - 1) {
      _size++;
    }
    return i;
  }

  // add -- append value to end
  public void add(int val) {
    if(_size==_data.length) {
      expand();
    }
    _data[_size]=val;
    _size++;
  }

  public void add(int index, int val) {
    if(index > _size) {
      index=_size;
    }
    if(_size==_data.length) {
      expand();
    }
    for(int i = _size-1; i >= index; i--) {
      _data[i+1] = _data[i];
    }

    _data[index]=val;
    _size++;
  }

  public void remove(int index) {
    for(int i = index; i < _size; i++) {
      _data[i]=_data[i+1];
    }
    if (_size != 0) {
      _size--;
    }
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

      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);

      curtis.add(9);
      System.out.println("Printing SuperArray curtis with value added...");
      System.out.println(curtis);

      curtis.add(2,100);
      System.out.println("Printing SuperArray curtis with value added at index 2...");
      System.out.println(curtis);

      curtis.remove(2);
      System.out.println("Printing SuperArray curtis with value removed at index 2...");
      System.out.println(curtis);



    /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~

      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
