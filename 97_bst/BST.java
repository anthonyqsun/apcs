/*
uwu kittens: Anthony Sun, Ivina Wang, Jaylen Zeng
APCS pd 7
HW97: Prune Your Tree
2022-05-12r
time spent: 1.0 hrs
*/
import java.util.LinkedList;

/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );

    if ( _root == null ) {
      _root = newNode;
      return;
    }
    insert( _root, newNode );
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if ( newNode.getValue() < stRoot.getValue() ) {
      if ( stRoot.getLeft() == null )
        stRoot.setLeft( newNode );
      else
        insert( stRoot.getLeft(), newNode );
    }
    else {
      if ( stRoot.getRight() == null )
        stRoot.setRight( newNode );
      else
        insert( stRoot.getRight(), newNode );
    }
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
    public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
	    return;
    System.out.print( currNode.getValue() + " " );
    preOrderTrav( currNode.getLeft() );
    preOrderTrav( currNode.getRight() );
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav( _root );
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    inOrderTrav( currNode.getLeft() );
    System.out.print( currNode.getValue() + " " );
    inOrderTrav( currNode.getRight() );
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav( _root );
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    postOrderTrav( currNode.getLeft() );
    postOrderTrav( currNode.getRight() );
    System.out.print( currNode.getValue() + " "  );
  }


  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*****************************************************
     * TreeNode search(int)
     * returns pointer to node containing target,
     * or null if target not found
     *****************************************************/
    TreeNode search( int target )
    {
      return sendhelp(_root, target);  
    }
    
    TreeNode sendhelp (TreeNode roots, int target){
      if (roots == null){
        return null;
      }
      if (roots.getValue() == target){
        return roots;
      }
      TreeNode left = sendhelp(roots.getLeft(), target);
      if (left != null){
        return left;
      }
      TreeNode right = sendhelp(roots.getRight(), target);
      if (right != null){
        return right;
      }
      return null;
      

    }
    
    
    /*****************************************************
     * int height()
     * returns height of this tree (length of longest leaf-to-root path)
     * eg: a 1-node tree has height 1
     *****************************************************/
    public int height()
    {
    	return heightHelper(_root);
    }
    int heightHelper(TreeNode current) {
      if(current == null) return 0;
      int leftHeight = 1 + heightHelper(current.getLeft());
      int rightHeight = 1 + heightHelper(current.getRight());
      if(leftHeight > rightHeight) {
        return leftHeight;
      }
      return rightHeight;
    }
    
    
    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/
    public int numLeaves()
    {
    	return leaveshelps(_root);
    }
    int leaveshelps(TreeNode current){
      if (current == null) return 0;
      if (current.getLeft() == null && current.getRight() == null){
        return 1;
      }
      return leaveshelps(current.getLeft()) + leaveshelps(current.getRight());
      
    }

    public TreeNode remove (int target) {
      TreeNode targetNode = search(target);
      if(targetNode == null) return null; //checks if in tree
      TreeNode parent;
      if (_root.getValue() == target){
        TreeNode superRoot = new TreeNode(0);
        superRoot.setLeft(_root);
        parent = superRoot;
      }
      else parent = goToParentOf(target, _root);
      return removeH(target, parent);
    }

    public TreeNode goToParentOf(int target, TreeNode current) {
      if (current.getLeft().getValue() == target || current.getRight().getValue() == target) return current;
      if (target < current.getValue()) return goToParentOf(target, current.getLeft());
      return goToParentOf(target, current.getRight());
    }

    public TreeNode removeH (int target, TreeNode current) {
      TreeNode targetNode;
      boolean left;
      if (target < current.getValue()){
        targetNode = current.getLeft();
        left = true;
      }
      else {
        targetNode = current.getRight();
        left = false;
      }

      boolean leftIsNull = targetNode.getLeft() == null;
      boolean rightIsNull = targetNode.getRight() == null;

      if (leftIsNull && rightIsNull) { // leaf base case
        if (left) current.setLeft(null);
        else current.setRight(null);
        return targetNode;
      }

      if (leftIsNull) {
        if (left) current.setLeft(targetNode.getRight());
        else current.setRight(targetNode.getRight());
        return targetNode;
      }

      if (rightIsNull) {
        if (left) current.setLeft(targetNode.getLeft());
        else current.setRight(targetNode.getLeft());
        return targetNode;
      }

      if (left) {
        TreeNode parent = goToParentOf(getFarRight(targetNode).getValue(), targetNode);
        current.setLeft(removeH(parent.getRight().getValue(), parent));
      }
      else {
        TreeNode parent = goToParentOf(getFarLeft(targetNode).getValue(), targetNode);
        current.setRight(removeH(parent.getLeft().getValue(), parent));
      }
      return targetNode;
      
    }

      // -------------------
      
      
    
    //precond current != null
    public TreeNode getFarLeft(TreeNode current) {
      if (current.getLeft() == null) {
        return current;
      }
      return getFarLeft(current.getLeft());
    }
     
    //precond current != null
    public TreeNode getFarRight(TreeNode current) {
      if (current.getRight() == null){
        return current;
      }
      return getFarRight(current.getRight());
    }

  //toString
  public String toString(){
          LinkedList<TreeNode> q = new LinkedList<TreeNode>();
          q.add(_root);
          return toString(q,1,this.height());
  }

  String toString(LinkedList<TreeNode> printQueue,int layerNum,int height){
      if (height==0){return "";}
      int printLen = printQueue.size();
      int initialSpace = (int) Math.pow(2,height-layerNum)-1;
      String thisLayer = "";
      for (int sp = 0;sp<initialSpace;sp++)
          thisLayer+=" ";
      for (int i = 0; i<printLen;i++){
          TreeNode item = printQueue.removeFirst();
          if (item ==null){
              thisLayer+=" ";
              printQueue.addLast(null);
              printQueue.addLast(null);
          } else {
              thisLayer+=item.getValue();
              printQueue.addLast(item.getLeft());
              printQueue.addLast(item.getRight());
          }
          for (int sp = 0;sp<2*initialSpace+1;sp++)
              thisLayer+=" ";
      }
      if (layerNum==height){return thisLayer;}
      else {
          return thisLayer+"\n"+toString(printQueue,layerNum+1,height);
      }
  }

    //main method for testing
  public static void main( String[] args ) {

    BST arbol = new BST();

    System.out.println( "tree init'd: " + arbol );

    //inserting in this order will build a perfect tree
    arbol.insert( 3 );
    arbol.insert( 1 );
    arbol.insert( 0 );
    arbol.insert( 2 );
    arbol.insert( 5 );
    arbol.insert( 4 );
    arbol.insert( 6 );
    /*
    */

    //insering in this order will build a linked list to left
    /*
    arbol.insert( 6 );
    arbol.insert( 5 );
    arbol.insert( 3 );
    arbol.insert( 4 );
    arbol.insert( 2 );
    arbol.insert( 1 );
    arbol.insert( 0 );
    */

    System.out.println( "tree after insertions:\n" + arbol );
    System.out.println();

    System.out.println();
    for( int i=-1; i<8; i++ ) {
        System.out.println(" searching for "+i+": " + arbol.search(i) );    
    }

    System.out.println();
    System.out.println( arbol );

    arbol.remove(6);
    System.out.println();
    System.out.println( arbol );

    arbol.remove(5);
    System.out.println();
    System.out.println( arbol );

    arbol.remove(4);
    System.out.println();
    System.out.println( arbol );

    arbol.remove(3);
    System.out.println();
    System.out.println( arbol );

    arbol.remove(2);
    System.out.println();
    System.out.println( arbol );

    arbol.remove(1);
    System.out.println();
    System.out.println( arbol );

    arbol.remove(0);
    System.out.println();
    System.out.println( arbol );
    }
}//end class