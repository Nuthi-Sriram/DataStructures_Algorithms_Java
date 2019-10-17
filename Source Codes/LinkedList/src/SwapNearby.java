
/**Swap the nearby elements in a linked list*/
import java.util.Scanner;

public class SwapNearby {

	public void swapper(SList L1) {
		LNode temp = L1.head;
		int k;
		while (temp != null && temp.next != null) {
			k = temp.info;
			temp.info = temp.next.info;
			temp.next.info = k;
			temp = temp.next.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SList L1 = new SList();
		SwapNearby obj = new SwapNearby();
		System.out.println("Enter the number of elements you want to enter into the list");
		int n = sc.nextInt();
		System.out.println("Start entering the values into the linked list");
		while (n != 0) {
			System.out.println("Enter the element to insert last");
			int x = sc.nextInt();
			L1.insertLast(x);
			n--;
		}
		obj.swapper(L1);
		L1.display();
		sc.close();
	}

}
