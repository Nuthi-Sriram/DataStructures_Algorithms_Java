
/**Storing of alternate nodes in another linked list*/
import java.util.Scanner;

public class AlternateNodes {
	public LNode head, tail;

	public AlternateNodes() {

		head = tail = null;

	}

	public void alternate(SList L1) {
		LNode t = L1.head;
		LNode temp = new LNode(t.info);
		head = temp;
		t = t.next.next;
		try {
			while (t != null) {
				temp.next = new LNode(t.info);
				temp = temp.next;
				t = t.next.next;
			}
			tail = temp;
		}

		catch (Exception e) {

		}

	}

	public void display() {
		LNode t = head;
		while (t.next != null) {
			System.out.println(t.info);
			t = t.next;
		}
		System.out.println(t.info);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SList L1 = new SList();
		AlternateNodes L = new AlternateNodes();
		System.out.println("Enter number of numbers which you want to enter into the list");
		int n = sc.nextInt();
		while (n != 0) {
			System.out.println("Enter the number to insertLast");
			int x = sc.nextInt();
			L1.insertLast(x);
			n--;
		}
		L.alternate(L1);
		L.display();
		sc.close();
	}

}
