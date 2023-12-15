package java_generics_all_code_no_2;

import java.util.EmptyStackException;

public class Stack<E> {
    private final int size; // number of elements in the stack
    private int top; // location of the top element
    private E[] elements; // array that stores stack elements

    // no-argument constructor creates a stack of the default size
    public Stack() {
        this(10); // default stack size
    }

    // constructor creates a stack of the specified number of elements
    public Stack(int s) {
        size = s > 0 ? s : 10; // set size of Stack
        top = -1; // Stack initially empty
        elements = (E[]) new Object[size]; // create array
    }

    // Push an element onto the stack
    public void push(E pushValue) {
        if (top == size - 1) // if stack is full
            throw new FullStackException(String.format("Stack is full, cannot push %s", pushValue));

        elements[++top] = pushValue; // place pushValue on Stack
    }

    // Pop and return the top element if not empty; else throw EmptyStackException
    public E pop() {
        if (top == -1) // if stack is empty
            throw new EmptyStackException();

        /*E poppedValue = elements[top]; // Get the top element
        elements[top--] = null; // Remove the reference to the top element
        return poppedValue;*/ // return the top element
        return elements[ top-- ];
    }
}


