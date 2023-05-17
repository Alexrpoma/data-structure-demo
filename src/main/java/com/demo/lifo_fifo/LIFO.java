package com.demo.lifo_fifo;

import java.util.Stack;

/**
 * The Stack class represents a last-in first-out (LIFO) stack of objects
 * It extends class Vector with five operations that allow a vector to be treated as a stack
 * The usual push and pop operations are provided, as well as method to peek at the top item on the stack,
 * a method to test for whether  the stack is empty, and a method  to search the stack for an item and
 * discover how  far it is  from top.
 */
public class LIFO {

  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(45);
    stack.push(20);
    stack.push(95);
    System.out.println(stack);

    stack.pop(); //Removes the object at the top of this stack and returns that object as the value of this function.
    System.out.println(stack);

    System.out.println(stack.peek()); //Looks at the object at the top of this stack without removing it from the stack.
  }

}
