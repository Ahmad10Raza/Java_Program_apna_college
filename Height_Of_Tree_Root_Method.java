// Java program for above approach
import java.util.LinkedList;
import java.util.Queue;

class Height_Of_Tree_Root_Method {

// A tree node structure
static class Node {
	int key;
	Node left;
	Node right;
}

// Utility function to create
// a new node
static Node newNode(int key) {
	Node temp = new Node();
	temp.key = key;
	temp.left = temp.right = null;
	return temp;
}


/*Function to find the height(depth) of the tree*/
public static int height( Node root){

	//Initialising a variable to count the
	//height of tree
	int depth = 0;

	
	Queue<Node> q=new LinkedList<>();
	
	//Pushing first level element along with null
	q.add(root);
	q.add(null);
	while(!q.isEmpty()){
		Node temp = q.peek();
		q.remove();
	
		//When null encountered, increment the value
		if(temp == null){
			depth++;
		}
		
		//If null not encountered, keep moving
		if(temp != null){
			if(temp.left!=null){
				q.add(temp.left);
			}
			if(temp.right!=null){
				q.add(temp.right);
			}
		}
	
		//If queue still have elements left,
		//push null again to the queue.
		else if(!q.isEmpty()){
			q.add(null);
		}
	}
	return depth;
}



// Driver Code
public static void main(String args[]) {
	Node root = newNode(1);
	root.left = newNode(12);
	root.right = newNode(13);

	root.right.left = newNode(14);
	root.right.right = newNode(15);

	root.right.left.left = newNode(21);
	root.right.left.right = newNode(22);
	root.right.right.left = newNode(23);
	root.right.right.right = newNode(24);

	System.out.println("Height(Depth) of tree is: "+height(root));

	}
}

// This code is contributed by jana_sayantan.
