public class doublylinkedlist {
    public  static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data=data;
        }
    }
    public  static  void  display(node head)
    {
        node temp= head;
        while(temp!= null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displayrev(node tail)
    {
        node temp =tail;
        while(temp!= null)
        {
            System.out.print(temp.data + " ");
            temp=temp.prev;
        }
        System.out.println( );
    }
    public static void displayran(node random)
    {
        node temp = random;
        while (temp.prev!=null)
        {
            //System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        while(temp!= null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        node a =new node(12);
        node b= new node(6);
        node c = new node(4);
        //a.prev=null;
        a.next =b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        //c.next=null;
        System.out.println();
        display(a);
        displayrev(c);
        displayran(b);

    }
}
