//This demonstrates the Last-In-First-Out (LIFO) principle of the stack, 
//where the last element pushed onto the stack is the first one to be popped off.
package collection;

import java.util.Stack;

public class LearnStack {
    
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();

        //push(E item): Pushes an item onto the top of the stack.
        stack.push("Sahil");
        stack.push("Tanvi");
        stack.push("Salomi");
        stack.push("Nikhil");
        stack.push("Aryan");
        stack.push("Ankit");
        stack.push("Heli");

        System.out.println("LIFO : " + stack);

        //peek(): Looks at the object at the top of the stack without removing it.
        System.out.println(stack.peek());

        //pop(): Removes the object at the top of the stack and returns that object.
        stack.pop();

        System.out.println("LIFO : " + stack);

        System.out.println(stack.peek());

        //isEmpty(): Tests if the stack is empty.
        boolean empty = stack.isEmpty();

        System.out.println(empty);

        //search(Object o): Returns the 1-based position from the top of the stack where the object is located; 
        //the method returns -1 if the object is not on the stack.
        int position1 = stack.search("Nikhil");
        int position2 = stack.search("Heli");
        int position3 = stack.search("Sahil");

        System.out.println(position1);
        System.out.println(position2);
        System.out.println(position3);
    }
}
