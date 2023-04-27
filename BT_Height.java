import java.util.*;
 import java.util.Queue; 

// A binary tree node
class Node {
	int data;
	Node left, right;
    public int key;

	Node(int item)
	{
		data = item;
		left = right = null;
	}
}

class BT_Height {
	Node root;

	/* Compute the "maxDepth" of a tree -- the number of
	nodes along the longest path from the root node
	down to the farthest leaf node.*/
	int maxDepth_01(Node node)
	{
		if (node == null)
			return 0;
		else {
			/* compute the depth of each subtree */
			int lDepth = maxDepth_01(node.left);
			int rDepth = maxDepth_01(node.right);

			/* use the larger one */
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}



    static Node newNode(int key)
    {
        Node temp = new Node(key);
        temp.key = key;
        temp.left = temp.right = null;
        return temp;
    }

    /*Function to find the height(depth) of the tree*/
    public static int height(Node root)
    {

        // Initialising a variable to count the
        // height of tree
        int depth = 0;

        Queue<Node> q = new LinkedList<>();

        // Pushing first level element along with null
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.remove();

            // When null encountered, increment the value
            if (temp == null) {
                depth++;
            }

            // If null not encountered, keep moving
            if (temp != null) {
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }

            // If queue still have elements left,
            // push null again to the queue.
            else if (!q.isEmpty()) {
                q.add(null);
            }
        }
        return depth;
    }

	/* Driver program to test above functions */
	public static void main(String[] args)
	{
		BT_Height tree = new BT_Height();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Height of tree is "+ tree.maxDepth_01(tree.root));
        System.out.println("Height(Depth) of tree is: "+ height(tree.root));
	}
}

// This code has been contributed by Amit Srivastav
