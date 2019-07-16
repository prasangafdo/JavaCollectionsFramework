import java.util.*;

class stack{

public static void main (String[] args){

	Stack <String> stack = new Stack<>();

	stack.push("S");
	stack.push("A");
	stack.push("N");
	stack.push("D");
	stack.push("U");
	stack.push("N");
	stack.push("I");

	// Iterator iterator = stack.iterator();

	// while (iterator.hasNext()){
	// 	System.out.println(iterator.next());
	// }

	//stack.push();

	Iterator iterator = stack.iterator();

	 while (stack.isEmpty() == false){
		 	System.out.println(stack.pop());
	 }
}
}