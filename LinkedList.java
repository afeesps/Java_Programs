import jav.io.*

class Node
{

  private int data;
  private Node Next;

  public Node()
  {
   this.data = 0;
   this.Next = NULL;
  }

  public Node(int value)
  {
    this.data = value;
    this.Next = NULL;
  }

}

class LinkedList
{
  
   private Node head;

   public LinkedList()
   {
      this.head = NULL;
   }

   public void insertdata(int val)
   {
  
      Node N1 = new Node(val);
      if(head == NULL)
      {
         this.head = N1;
      }
     
      Node temp = head;
:
      while(temp.next!=null)
      {
        temp = temp.next;
      }


      temp.next = N1;
    }
 }


 public class Lnklistpgm
 {

  public static void main(String [] args)
  {
      
      LinkedList L1 = new LinkedList();

      L1.insertdata(10);
      L1.insertdata(20);

  }

 }






