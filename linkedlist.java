// import java.util.LinkedList;
public class linkedlist {
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static int length(Node head)  {
        int count =0;
        while(head!= null)
        {
             count++;
            head= head.next;
        }
        return count;

    }

    public static void displayr(Node head)
    {
        if(head == null)
            return;
        //System.out.print( head.data+" ");
        displayr( head.next);
        System.out.print( head.data+" ");
    }
    public static Node fromlast(Node head,int n)
    {
      int size=0;
      Node temp = head;
        while(temp!= null)
        {
            size++;
            temp= temp.next;
        }
        temp=head;
        int m = size-n+1;
        for(int i=1;i<m;i++)
        {
            temp= temp.next;

        }
        return  temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a =new Node (6);
        Node b=new Node (7);
        Node c = new Node (23);
        Node d= new Node (8);
        a.next =b;
        b.next=c;
        c.next=d;
       display(a);
       displayr(a);
        // Node p =fromlast(a,2);
        System.out.println();
        System.out.print(fromlast(a,2).data);


    }
}
