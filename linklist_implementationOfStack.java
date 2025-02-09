public class linklist_implementationOfStack {
    public static class node{
        int val;
        node next;

        node(int val)
        { this.val=val;
            this.next = null;
        }}
    static class Stack{
        node head = null;
        int size =0;
        void push(int x){
            node temp =new node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if(head ==null)return -1;
            int x =head.val;
            head=head.next;
            return x;
        }
        int peek(){
            if(head ==null)return -1;
            return head.val;
        }
        // void display(){
        //   node temp =head;
        //   while(temp!=null){
        //     System.out.println(temp.val +" ");
        //     temp=temp.next;
        //   }
        // }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // st.peek();
        st.pop();
//        st.display();
        // System.out.println(st.pop());
        // st.display();
    }
}
