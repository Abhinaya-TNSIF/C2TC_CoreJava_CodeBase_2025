package Demo;
import java.util.Stack;
public class Collection {

	public static void main(String[] args) {
		// Stack
		Stack<Integer> obj=new Stack<>();
		//Add elements
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		
		System.out.println(obj);
		
		//Delete elements
		obj.pop();
		obj.pop();
		System.out.println(obj);
		
		//To get the top of the stack
		System.out.println(obj.peek());
	}

}
