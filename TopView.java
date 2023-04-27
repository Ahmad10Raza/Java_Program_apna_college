import java.util.*;

class TopView {
	// Structure of binary tree
	static class Node {
		Node left;
		Node right;
		int data;
	
		Node(int data) {
			this.left = this.right = null;
			this.data = data;
		}
	}

	//Queue Object Structure
	static class QueueObj {
	Node node;
	int hd;

	QueueObj(Node node, int hd)
	{
		this.node = node;
		this.hd = hd;
	}
	}

	static void topView(Node root)
	{
		if (root == null)
			return;

		Queue<QueueObj> q = new LinkedList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int min = 0;
		int max = 0;
		//Level Order Traversal
		q.add(new QueueObj(root, 0));
		while (!q.isEmpty()) {
			QueueObj curr = q.poll();
			
			//only include in map if this is the
			//first node of this specific
			//horizontal distance
			if (!map.containsKey(curr.hd)) {
				map.put(curr.hd, curr.node.data);
			}
			
			
			if (curr.node.left != null) {
				//min can be found only in left side due to "-1"
				//minimum horizontal distance of any node from root
				min = Math.min(min, curr.hd - 1);
				q.add(
					new QueueObj(curr.node.left, curr.hd - 1));
			}

			if (curr.node.right != null) {
				//max can be found only in right side due to "+1"
				//maximum horizontal distance of any node from root
				max = Math.max(max, curr.hd + 1);
				q.add(
					new QueueObj(curr.node.right, curr.hd + 1));
			}
		}
		
		//traversal of (horizontal distance from root)
		//minimum to maximum
		for (; min <= max; min++) {
			System.out.print(map.get(min)+" ");
		}
	}

	// Driver Code
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.left.right.right = new Node(5);
		root.left.right.right.right = new Node(6);
		System.out.println("Following are nodes in"
						+ " top view of Binary Tree");
		topView(root);
	}
}
//Code Contributed by Animesh Singh
