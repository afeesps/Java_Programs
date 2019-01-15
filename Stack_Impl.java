import java.io.*;

class Stack{
	
 private int top;
 private int size;
 private int [] stack;

 Stack(int n)
 {
    this.top = -1;
    this.size=n;
    this.stack=new int[size]; 

 }

 public void push(int elem){
     ++top;
    if(top<size)
      stack[top] = elem;
    else 
       System.out.println("Stack Overflow");

 }

 public void pop(){

  if(top==-1)
     System.out.println("Stack Empty");
     
  else 
    System.out.println(stack[top]);
    top--;
 }

 public void display_stack(){

   for(int i=0;i<stack.length;i++){

      System.out.println("stack["+i+"]"+":"+stack[i]);
   }

 }


}


public class Stack_Impl
{
	

   public static void main(String args[]){

   Stack s1;

   s1 = new Stack(10);

   s1.push(5);
   s1.push(10);

   s1.push(17);
   s1.push(16);
   s1.push(15);
   s1.push(14);
   s1.push(13);

   s1.pop();
   s1.pop();
   s1.display_stack();

   return;


}




}