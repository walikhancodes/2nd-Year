import java.util.Iterator;
@SuppressWarnings("unchecked")
public class Stack<A> implements Iterable<A> {

    private A[] stack;
    private int top;

    /**
     * Constructs a new Stack
     */
    public Stack(){
        stack = (A[]) new Object[1];
        top = 0;
    }

    /**
     * Creates an iterator for the Stack
     */
    public StackIterator iterator(){
        return new StackIterator();
    }

    /**
     * Changes the size of the array which holds the stack.
     * @param newSize   the desired size of the stack
     */
    private void resize(int newSize){
        A[] newStack = (A[]) new Object[newSize];

        for(int i = 0; i < size(); i++){
            newStack[i] = this.stack[i];
        }

        this.stack = newStack;
    }

    /**
     * adds a new element to the top of the stack
     * @param item  the element to be added
     */
    public void push(A item){
        if(this.stack.length == top){
            resize(size() * 2);
        }
        stack[top] = item;
        top++;
    }

    /**
     * removes the element on top of the stack and returns it
     * @return  the element on top of the stack
     */
    public A pop(){
        if(isEmpty()){
            System.out.println("Can't pop, stack is empty!");
            return null;
        }
    
        A temp = stack[top-1];
        top--;
        stack[top] = null;
        if (size() <= this.stack.length / 4)
            resize(this.stack.length / 2);

        return temp;
    }

    /**
     * Checks whether the stack is empty
     * @return  true if the stack is empty, false if it is not
     */
    public boolean isEmpty(){
        return top == 0;
    }

    /**
     * Returns the current size of the stack.
     * @return  the number of elements on the stack.
     */
    public int size(){
        return top;
    }

    private class StackIterator implements Iterator<A>{

        int index = top - 1;
        public boolean hasNext(){
            return index >= 0;
        }

        public A next(){
            return stack[index--];
        }
    }
}


class TestStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        for (int i = 0; i < 10; i++)
            myStack.push(i);

        for (int data: myStack){
            System.out.println(data);
        }
    }
}