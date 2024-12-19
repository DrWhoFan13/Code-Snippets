import java.util.Stack;

public class BinaryTreeTraverse
{
  public static void main (String[]args)
  {
	// create the binary tree
	BinaryTree bt = BinaryTree.create ();

	// traverse the binary tree using recursive InOrder traversal
	  System.out.
	  println ("Nodes of binary tree on recursive InOrder traversal:");
	  bt.inOrder ();
  }
}

class BinaryTree
{
  static class TreeNode
  {
	String data;
	TreeNode left;
	TreeNode right;

	  TreeNode (String value)
	{
	  this.data = value;
	  left = right = null;
	}
  }

  // root of binary tree
  TreeNode root;

	/**
     * algorithm to traverse the binary tree on recursive InOrder
     */
  public void inOrder ()
  {
	inOrder (root);
  }

  private void inOrder (TreeNode node)
  {
	if (node == null)
	  return;
	inOrder (node.left);
	System.out.printf ("%s ", node.data);
	inOrder (node.right);
  }

	/**
     * Java method to create binary tree with test data
     * 
     * @return a sample binary tree for testing
     */
  public static BinaryTree create ()
  {
	BinaryTree tree = new BinaryTree ();
	tree.root = new TreeNode ("6");
	tree.root.left = new TreeNode ("2");
	tree.root.left.left = new TreeNode ("1");
	tree.root.right = new TreeNode ("8");
	tree.root.left.right = new TreeNode ("4");
	tree.root.left.right.left = new TreeNode ("3");
	tree.root.left.right.right = new TreeNode ("5");
	tree.root.right.left = new TreeNode ("7");
	tree.root.right.right = new TreeNode ("9");
	return tree;
  }
}
