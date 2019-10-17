/**Implementation of binary search tree*/

import java.util.Scanner;

class TNode {
int data;
TNode left, right;

public TNode(int x) {
data = x;
left = right = null;
}
}

public class BST {
TNode root;

public BST() {
root = null;
}

TNode insert(TNode t, int y) {
if (t == null) {
t = new TNode(y);
return t;
} else {
if (y > t.data) {
t.right = insert(t.right, y);
} else {
t.left = insert(t.left, y);
}
return t; // Don't miss out on the return t statement after the if
// and else block both of them share a common return t
// statement
}
}

void Preorder(TNode root) {
if (root == null)
return;
else {
System.out.print(root.data + " ");
Preorder(root.left);
Preorder(root.right);
}
}

void Postorder(TNode root) {
if (root == null)
return;
else {
Postorder(root.left);
Postorder(root.right);
System.out.print(root.data + " ");
}
}

void Inorder(TNode root) {
if (root == null)
return;
else {
Inorder(root.left);
System.out.print(root.data + " ");
Inorder(root.right);
}
}

int isExternal(TNode t) {
if ((t.left == null) && (t.right == null))
return 1;
else
return 0;
}

int search(TNode root, int y) {
if (root == null)
return 0;
else if (root.data == y)
return 1;
else {
if (y > root.data)
return (search(root.right, y));
else
return (search(root.left, y));
}
}
void delete(TNode root,int x){
TNode t=root,pt=root;
if(root==null)
System.out.println("Tree is empty");
else if((root.data==x)&&(root.left==null)&&(root.right==null))
root=null;
else {
while((t!=null)&&(t.data!=x)){
if(x>t.data){
pt=t;t=t.right;
}
else{
pt=t;
t=t.left;
}
}
if(t==null)
System.out.println("Element not found");
else{
if((t.left==null)&&(t.right==null)){
if(x>pt.data)
pt.right=null; //Leaf is on right side of pt
else
pt.left=null; //Leaf is on left side of pt
}
}
if((t.left!=null)&&(t.right==null)){
if((t.left!=null)&&(t.right==null)){
if(t.data<pt.data)
pt.left=t.left;
else if(t.data>pt.data)
pt.right=t.left;
}
}
if((t.left==null)&&(t.right!=null)){
if((t.left!=null)&&(t.right==null)){
if(t.data<pt.data)
pt.left=t.left;
else if(t.data>pt.data)
pt.right=t.left;
}
}
if((t.left!=null)&&(t.right!=null)){
pt=t;TNode t1;
t1=t.right;
while(t1.left!=null){
pt=t1;
t1=t1.right; //Finding inOrder successor(One step right and extreme left
}
t.data=t1.data;
if(pt==t)
pt.right=t1.right;
else
pt.left=t1.right;
}
}
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
TNode root = null;// Make sure you declare local variable for root
BST b = new BST();
int option;
do {
System.out
.println("\nEnter an operation which you want to perform");
System.out.println("1)To insert value into the binary search tree");
System.out.println("2)To perform Preorder traversal");
System.out.println("3)To perform Inorder traversal");
System.out.println("4)To perform Postorder traversal");
System.out.println("5)Check whether leaf or external");
System.out.println("6)Search for an element in the binary tree");
System.out.println("7)Deleting a node from the binary search tree");
option = sc.nextInt();
switch (option) {
case 1: {
System.out
.println("Enter the number of elements which you want to enter into the Binary search tree");
int n = sc.nextInt();
int i = 1;
while (n != 0) {

System.out.println("Enter the " + i
+ " value  which you want to enter into the list");
int x = sc.nextInt();
root = b.insert(root, x);
i++;
n--;

}
}
break;
case 2: {
b.Preorder(root);
}
break;
case 3: {
b.Inorder(root);
}
break;
case 4: {
b.Postorder(root);
}
break;
case 5: {
int x = b.isExternal(root);
if (x == 1)
System.out.println("It is a leaf");
else
System.out.println("Not a leaf");
}
break;
case 6: {
System.out
.println("Enter the element which you want to search for");
int y = sc.nextInt();
int x=0;
x = b.search(root, y);
if (x == 1)
System.out
.println("The given element is present in the tree");
else
System.out
.println("The given element is not present in the tree");
}
break;
case 7: {
System.out
.println("Enter the element which you want to delete");
int y = sc.nextInt();

b.delete(root, y);
}
break;
}
} while (option >= 1 && option <= 7);

sc.close();
}
}