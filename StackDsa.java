import java.util.Stack;
public class StackDsa {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(4);
        st.push(6);
        st.push(8);
        System.out.println(st);
       // System.out.println(st.pop()); //st.pop();
        System.out.println(st.peek());st.peek();
        System.out.println(st.isEmpty());
        System.out.println(st.empty());
        System.out.println(st.search(6));
        System.out.println(st.capacity());
        System.out.println(st.size());
        st.set(1,9);
        System.out.println(st);
    }
}
