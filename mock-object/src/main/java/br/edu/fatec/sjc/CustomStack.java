package br.edu.fatec.sjc;

public class CustomStack<T> {

    private java.util.Stack<T> stack = new java.util.Stack<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Number pop() throws StackEmptyException {
        if (stack.isEmpty()) {
            throw new StackEmptyException("The stack is empty");
        }
        return (Number) stack.pop();
    }
}
