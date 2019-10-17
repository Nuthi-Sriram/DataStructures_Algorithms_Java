import java.util.Scanner;

class stack1 {
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

		return top + 1;
	}

}

class postfixeval {
	public static void main(String args[])
	{
		stack1 s=new stack1();
		Scanner scan=new Scanner(System.in);
		int i,res=0;
		char ch;
		int op1,op2;
		String str="abc-*";

		for(i=0;i<str.length();i++){
			if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				System.out.println("Enter the value for "+str.charAt(i));
				int data=scan.nextInt();
				s.push(data);
			}
			else{
				op1=s.pop();
				op2=s.pop();
				if(str.charAt(i)=='+'){
					res=op2+op1;
				}
				
				else if(str.charAt(i)=='-')
				{
					res=op2-op1;
				}
				else if(str.charAt(i)=='/'){
					res=op2/op1;
				}else if(str.charAt(i)=='*'){
					res=op2*op1;
				}
				
				s.push(res);
				
				
				
				
			}
			System.out.println(s.pop());
		
		
		}
	}
}

