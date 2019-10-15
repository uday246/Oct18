package Oct5th;

import java.util.ArrayList;
import java.util.List;

public class TreeTester {
	public static void main(String[] args) {
		Tree t1 = new Tree("Anne");
		Tree t2 = new Tree("Peter");
		t1.addSubtree(t2);
		Tree t3 = new Tree("Zara");
		t1.addSubtree(t3);
		Tree t4 = new Tree("Savannah");
		t2.addSubtree(t4);
		System.out.println("Size: " + t1.size());
		System.out.println("Expected: 4");
		System.out.println("Leaf count: " + t1.leafCount());
		System.out.println("Expected: 2");
	}
}

/**
 * 
 * add a method that counts the number of leaves in the tree. The error is at
 * leafcount
 * 
 */

class Tree {

	private Node root;

	class Node

	{

		public Object data;
		public Node left;
		public Node right;
		public List<Node> children;

		/**
		 * 
		 * Computes the size of the subtree whose root is this node.
		 * 
		 * @return the number of nodes in the subtree
		 * 
		 */

		public int size()

		{

			int sum = 0;

			for (Node child : getRoot().children) {
				sum = sum + child.size();
			}

			return 1 + sum;

		}

	}

	/**
	 * 
	 * Constructs an empty tree.
	 * 
	 */

	public Tree()

	{

		setRoot(null);

	}

	/**
	 * 
	 * Constructs a tree with one node and no root.children.
	 * 
	 * @param rootData
	 *            the data for the root
	 * 
	 */

	public Tree(Object rootData)

	{

		setRoot(new Node());

		getRoot().data = rootData;

		getRoot().children = new ArrayList<>();

	}

	/**
	 * 
	 * Adds a subtree as the last child of the root.
	 * 
	 */

	public void addSubtree(Tree subtree)

	{

		getRoot().children.add(subtree.getRoot());

	}

	/**
	 * 
	 * Computes the size of this tree.
	 * 
	 * @return the number of nodes in the tree
	 * 
	 */

	public int size()

	{

		if (getRoot() == null) {
			return 0;
		}

		else {
			return getRoot().size();
		}

	}

	public int leafCount()

	{

		int sum = 0;

		if (getRoot().children.size() == 0)

		{

			sum = 1;

		}

		else

		{

			for (Node child : getRoot().children)

			{

				sum = sum + Tree.leafCount(child);

			}

		}

		return sum;
	}

	public static int leafCount(Node child)

	{

		// Implement the leafCount Method

		if (child == null)

			return 0;

		if (child.left == null && child.right == null)

			return 1;

		else

			return leafCount(child.left) + leafCount(child.right);

	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node aRoot) {
		root = aRoot;
	}

}