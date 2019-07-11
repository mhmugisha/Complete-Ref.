//Example from Java a complete Reference page 127.

//This class defines an integer stack that can hold 10 values

package classOperation;

public class Stack {

	int[] stck = new int[10];
	int tos;	//tos - top of stack.
	
	//constructor to initialize top of stack.
	Stack() {
		tos = -1; //why initialized inside constructor?
	}
	
	//Method to push an item onto top of stack
	void push(int item) {
		if(tos ==9)
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}
	
	//Method to pop an item off top of stack
		int pop() {
			if(tos < 0) 
			{
			System.out.println("Stack underflow.");
			return 0;
			}
			else
				return stck[tos--];
		}
		
	
}
