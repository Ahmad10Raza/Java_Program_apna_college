// Java Program of the above approac
class Kth_Level_Tree{

// A Binary Tree Node
static class Node {
	int data;
	Node left, right;
};

// Recursive function to print all
// nodes of a Binary Tree at a
// given level using DFS traversal
static void printNodes(Node root, int level, int K)
{
	// Base Case
	if (root == null) {
	return;
	}

	// Recursive Call for
	// the left subtree
	printNodes(root.left, level + 1, K);

	// Recursive Call for
	// the right subtree
	printNodes(root.right, level + 1, K);

	// If current level is
	// the required level
	if (K == level) {
	System.out.print(root.data+ " ");
	}
}

// Function to create a new tree node
static Node newNode(int data)
{
	Node temp = new Node();
	temp.data = data;
	temp.left = temp.right = null;
	return temp;
}

// Driver Code
public static void main(String[] args)
{
	Node root = newNode(3);
	root.left = newNode(9);
	root.right = newNode(6);
	root.left.left = newNode(11);
	int K = 2;

	printNodes(root, 1, K);
}
}

// This code is contributed by Rajput-Ji
