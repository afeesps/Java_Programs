import java.io.* ;

class Node
{

  private int data;
  public Node Next;

  public Node()
  {
   this.data = 0;
   this.Next = null;
  }

  public Node(int value)
  {
    this.data = value;
    this.Next = null;
  }

}

class LinkedList
{
  
   private Node head;

   public LinkedList()
   {
      this.head = null;
   }

   public void insertdata(int val)
   {
      System.out.println("Entered the func"+head); 
      Node N1 = new Node(val);
      if(head == null)
      {
         this.head = N1;
	 return;
      }
     
      Node temp = head;

      while(temp.Next!=null)
      {
        temp = temp.Next;
      }

      System.out.println("Node Inserted");
      temp.Next = N1;
    }
 }


 public class Lnklistpgm
 {

  public static void main(String [] args)
  {
      
      LinkedList L1 = new LinkedList();
      System.out.println("inserting the data");
      L1.insertdata(10);
      L1.insertdata(20);

  }

 }






