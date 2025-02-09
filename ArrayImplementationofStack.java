public class ArrayImplementationofStack {
    static class Stack{
        int arr[]=new int[100];
        int idx =0;
        boolean isEmpty(){
            if(idx==0)
                return true;
            return false;
        }
        void push(int x){
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0) return -1;
            return arr[idx-1];
        }
        int pop()
        {
            if(idx==0) return -1;
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display()
        {
            for (int i=0;i<=idx-1 ;i++ )
                System.out.println(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // st.peek();
        st.pop();
        // st.display();
        // System.out.println(st.pop());
        st.display();
    }
}
