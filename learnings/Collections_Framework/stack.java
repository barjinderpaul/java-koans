import java.util.*;


class stack {

    private static void basics() {
        System.out.println("LIFO ds");

        Stack<Integer> st = new Stack<>();
        System.out.println("empty stack = "+st);
        st.push(12);
        st.push(13);
        st.push(14);

        System.out.println(st);

        // returns index of the element in the stack; uses 1-based indexing
        int elementIndex = st.search(13);
        st.pop();
        System.out.println(elementIndex);
        System.out.println(st);

    }
    public static void main(String[] args) {
        basics();
    }
}