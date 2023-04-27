// Java program to print level in which X is present in
// binary tree
import java.util.LinkedList;
import java.util.Queue;

/* Class to represent Tree node */
class Node {
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = null;
		right = null;
	}
}

/* Class to print Level Order Traversal */
class BinaryTree {

	Node root;

	// Given a binary tree. Print its nodes in level order
	// using array for implementing queue.
	// Create a var represent current level of tree
	public static int currLevel = 1;
	int printLevelOrder(int X)
	{
		// Create an empty queue for level order traversal
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {

			// poll() removes the present head. For more
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Node tempNode = queue.poll();
				if (tempNode.data == X)
					return currLevel;
				/*Enqueue left child */
				if (tempNode.left != null)
					queue.add(tempNode.left);
				/*Enqueue right child */
				if (tempNode.right != null)
					queue.add(tempNode.right);
			}
			currLevel++;
		}
		return currLevel;
	}

	public static void main(String args[])
	{
		/* creating a binary tree and entering
			the nodes */
		BinaryTree tree_level = new BinaryTree();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);
		tree_level.root.right.left = new Node(7);
		tree_level.root.right.right = new Node(6);
		System.out.println("Level order traversal of binary tree is - "+ tree_level.printLevelOrder(6));
	}
}

// This code is contributed by Aditya Kumar (adityakumar129)
