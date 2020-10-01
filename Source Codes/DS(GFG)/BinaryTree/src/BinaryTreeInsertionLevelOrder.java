
//Given a binary tree and a key, insert the key into the binary tree at first position available in level order.
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author sriram
 *
 */
class Node {
	int key;
	Node left, right;
 
	Node(int key) {
		this.key = key;
		left = null;
		right = null;
	}
}

public class BinaryTreeInsertionLevelOrder {

	

	Node root;
	Node temp = root;

	void inorder(Node temp) {
		if (temp == null)
			return;

		inorder(temp.left);
		System.out.print(temp.key + " ");
		inorder(temp.right);
	}

	void insert(Node temp, int key) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);

		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp.left == null) {
				temp.left = new Node(key);
				break;
			} else
				q.add(temp.left);

			if (temp.right == null) {
				temp.right = new Node(key);
				break;
			} else
				q.add(temp.right);
		}
	}

	public static void main(String args[]) {
		BinaryTreeInsertionLevelOrder obj = new BinaryTreeInsertionLevelOrder();
		obj.root = new Node(10);
		obj.root.left = new Node(11);
		obj.root.left.left = new Node(7);
		obj.root.right = new Node(9);
		obj.root.right.left = new Node(15);
		obj.root.right.right = new Node(8);

		System.out.print("Inorder traversal before insertion:");
		obj.inorder(obj.root);

		int key = 12;
		obj.insert(obj.root, key);

		System.out.print("\nInorder traversal after insertion:");
		obj.inorder(obj.root);
	}
}
