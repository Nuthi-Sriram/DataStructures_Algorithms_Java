

import java.util.Scanner;
class expressionvalid{
	void infixvalid(String kk){
	int counter=0;
		int c=0;
		int n=kk.length();
		for(int i=0;i<n;i++)
		{
			if((kk.charAt(i)>='a'&&kk.charAt(i)<='z')||(kk.charAt(i)>='A'&&kk.charAt(i)<='Z'))
			{
	
				c++;
									
			}
				
		
			else if(kk.charAt(i)=='+'||kk.charAt(i)=='-'||kk.charAt(i)=='*'||kk.charAt(i)=='/')
			   
				{
				c--;
				}
				if(!(c==0||c==1))
				{
					counter++;
					break;
				}
				
				
			
		}
		
		if(counter==1)
		{
			System.out.println("Not a valid infix expression");
		}
		else 
			System.out.println("The given string is a valid infix expression");
	}
	


	void postfixvalid(String kk){
		int counter=0;
		int c=0;
		int n=kk.length();
		int countalpha=0,countopr=0,rank=0;
		for(int i=0;i<n;i++)
		{
			if((kk.charAt(i)>='a'&&kk.charAt(i)<='z')||(kk.charAt(i)>='A'&&kk.charAt(i)<='Z'))
			{countalpha++;
				c++;
				
					
			}
				
		
			else if(kk.charAt(i)=='+'||kk.charAt(i)=='-'||kk.charAt(i)=='*'||kk.charAt(i)=='/')
			   
				{
				countopr++;
				c--;
				}
			
			if(!(c>=1))
			{
				counter++;
				break;
			}
			
			
		}
		rank=countalpha-countopr;
		if(counter==1&&rank!=1)
		{
			System.out.println("Not a valid postfix expression");
		}
		else
		 	System.out.println("The given string is a valid post expression");
	}
	


	
	void prefixvalid(String kk){
		int counter=0;
		int c=0;
		int n=kk.length();
		int countalpha=0,countopr=0,rank=0;
		for(int i=0;i<n;i++)
		{
			if((kk.charAt(i)<='a'&&kk.charAt(i)>='z')||(kk.charAt(i)>='A'&&kk.charAt(i)<='Z'))
			{
				countalpha++;
				c++;
				
					
			}
				
		
			else if(kk.charAt(i)=='+'||kk.charAt(i)=='-'||kk.charAt(i)=='*'||kk.charAt(i)=='/')
			   
				{
				countopr++;
				c--;
				}
			if(!(c<=1))
			{
				counter++;		
				break;
			}
			
		}
		rank=countalpha-countopr;
		if(counter==1&&rank!=1)
		{
		 	System.out.println("The given string is a valid prefix expression");

		}
		else
			System.out.println("Not a valid prefix expression");
	}
	
}








public class expressionvalidity {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	expressionvalid i=new expressionvalid();
	System.out.println("Enter the string");
	String s=sc.nextLine();
	i.infixvalid(s);
	i.postfixvalid(s);
	i.prefixvalid(s);
}	
}

