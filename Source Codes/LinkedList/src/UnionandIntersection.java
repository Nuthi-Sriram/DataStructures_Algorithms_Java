
/**Program to find the Union and Intersection of two unsorted Linked List*/
import java.util.Scanner;

public class UnionandIntersection {
	static SList L3 = new SList();
	static SList L4 = new SList();

	public void union(LNode head1, LNode head2) {
		LNode t1 = head1;
		LNode t2 = head2;
		while (t1 != null) {
			L3.insertLast(t1.info);
			t1 = t1.next;
		}
		while (t2 != null) {
			if (!isPresent(head1, t2.info))
				L3.insertLast(t2.info);
			t2 = t2.next;
		}

	}

	public void intersection(LNode head1, LNode head2) {

		LNode t2 = head2;

		while (t2 != null) {
			if (isPresent(head1, t2.info))
				L4.insertLast(t2.info);
			t2 = t2.next;
		}

	}

	boolean isPresent(LNode head, int info) {
		LNode t = head;
		while (t != null) {
			if (t.info == info)
				return true;
			t = t.next;
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		SList L1 = new SList();
		SList L2 = new SList();

		UnionandIntersection uni = new UnionandIntersection();
		UnionandIntersection inter = new UnionandIntersection();

		System.out.println("Enter number of numbers which you want to enter into the list");
		int n = sc.nextInt();
		System.out.println("Start entering the values into L1");
		while (n != 0) {
			System.out.println("Enter the number to insertLast");
			int x = sc.nextInt();
			L1.insertLast(x);
			n--;
		}
		System.out.println("Enter number of numbers which you want to enter into the second list");
		n = sc.nextInt();
		System.out.println("Start entering the values into L2");
		while (n != 0) {

			System.out.println("Enter the number to insertLast");
			int y = sc.nextInt();
			L2.insertLast(y);
			n--;
		}
		System.out.println("The first Linked List is ");
		L1.display();
		System.out.println("The second Linked List is ");
		L2.display();
		uni.union(L1.head, L2.head);
		System.out.println("The union of the two linked lists is ");
		L3.display();
		inter.intersection(L1.head, L2.head);
		System.out.println("The intersection of the two Linked List is ");
		L4.display();
		sc.close();
	}

}
