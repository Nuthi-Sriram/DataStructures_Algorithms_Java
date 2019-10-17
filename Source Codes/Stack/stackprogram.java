import java.util.Scanner;

class stack {
	int i;
	int max_size = 5;
	int top = -1;
	int a[] = new int[max_size];

	void push(int e)

	{
		if (top == max_size - 1)
			System.out.println("Overflow");
		else {
			top++;
			a[top] = e;
		}
	}

	int pop() {
		if (top == -1)
			return -1;
		else {
			int x = a[top];
			top--;
			return x;
		}
	}

	int top_element() {
		if (top == -1)
			return -1;
		else {
			return a[top];
		}

	}

	int isEmpty() {
		if (top == -1)
			return 1;
		else
			return 0;
	}

	void display() {
		for (i = 0; i <= top; i++) {
			System.out.println(a[i]);
		}
	}

	int isFull() {
		if (top == max_size - 1)
			return 1;
		else
			return 0;
	}

	int size() {

		return top+1;
	}

}

public class stackprogram {
	public static void main(String args[]) {
		stack s = new stack();
		int option;
		Scanner sc = new Scanner(System.in);
		do {
			System.out
					.println("Enter on of the values to perform a stack function");
			System.out
					.println("1)Push-Inorder to push the element into an array");
			System.out
					.println("2)pop-Inorder to pop the element from an array");
			System.out
					.println("3)top-Inorder to see the top most element of an array");
			System.out
					.println("4)isEmpty-Inorder to Inorder to check whether an array is empty or not");
			System.out
					.println("5)Display-Inorder to see everyelement of an array");
			System.out
					.println("6)isFull-Inorder to check whether the array is full or not");
			System.out.println("7)size-Inorder to check the size of an array");
			System.out
					.println("Press anyother key in order to terminate the program");
			option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter the value which you want to push");
				int e = sc.nextInt();
				s.push(e);
			}
				break;

			case 2: {
				int x = s.pop();
				System.out.println("The popped out element is " + x);
			}
				break;

			case 3: {
				int x = s.top_element();
				System.out.println("The topmost element of an array is " + x);
			}
				break;
			case 4: {
				int x = s.isEmpty();
				if (x == 1)
					System.out.println("The given stack is empty");
				else
					System.out.println("The given stack is not empty");

			}
				break;
			case 5: {
				System.out.println("The elements of the stack are");
				s.display();

			}
				break;

			case 6: {
				int x = s.isFull();
				if (x == 1)
					System.out.println("The given stack is Full");
				else
					System.out.println("The given stack is empty");

			}
				break;
			case 7: {
				int x = s.size();
				System.out.println("The stack has " + x + " elements");
			}
				break;
			}
		}

		while (option >= 1 && option <= 7);
		sc.close();
	}
}

