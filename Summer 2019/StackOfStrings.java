public class StackOfStrings {

    private String[] stack;
    private int top;

    public StackOfStrings(){
        stack = new String[10];
        top = 0;
    }

    public void push(String item){
        stack[top] = item;
        top++;
    }

    public String pop(){
        String temp = stack[top-1];
        top--;
        stack[top] = null;
        return temp;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public int size(){
        return top;
    }
}

class TestStringStack {
    public static void main(String[] args) {
        String[] input = {"One", "Two", "Three", "Four", "Five"};
        StackOfStrings stack = new StackOfStrings();

        for(int i = 0; i < input.length; i++)
            System.out.println(input[i]);
        System.out.println();
        
        for(int i = 0; i < input.length; i++){
            stack.push(input[i]);
        }
        
        for (int i = 0; i < input.length; i++){
            input[i] = stack.pop();
        }
        
        for(int i = 0; i < input.length; i++)
            System.out.println(input[i]);
        System.out.println();

    }
}