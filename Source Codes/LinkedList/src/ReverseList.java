
/**Program to reverse the order of the list*/
import java.util.Scanner;

public class ReverseList {
	LNode head, tail;

	public ReverseList() {
		head = tail = null;
	}

	public void reverse(SList L) {
		LNode prev = null;
		LNode current = head;
		LNode n;
		while (current != null) {
			n = current.next;
			current.next = prev;
			prev = current;
			current = n;
		}
		tail = head;
		head = prev;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SList L = new SList();
		ReverseList obj = new ReverseList();
		System.out.println("Enter number of numbers which you want to enter into the list");
		int n = sc.nextInt();
		while (n != 0) {
			System.out.println("Enter the number to insertLast");
			int x = sc.nextInt();
			L.insertLast(x);
			n--;
		}
		obj.reverse(L);
		L.display();
		sc.close();
	}

}
