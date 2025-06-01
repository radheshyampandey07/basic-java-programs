package collections;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();

		/*----------------------- Add the values ----------------------- */

		stack.push("horse");
		stack.push("zebra");
		stack.push("lion");
		stack.push("elephant");

		/*----------------------- Print the values ----------------------- */
		System.out.println(stack);
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println(stack);

	}

}
