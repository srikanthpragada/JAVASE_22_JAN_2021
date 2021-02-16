package oop;

interface Stack {
	void push(String value);
	String pop();
	String peek();
	int length();
}

class StringStack implements Stack {
    private String[] data = new String[5];
    private int top = 0; 
    
	@Override
	public void push(String value) {
         data[top] = value;
         top ++;
	}

	@Override
	public String pop() {
		 top --;
		 return data[top];
	}

	@Override
	public int length() {
		 return top;
	}

	@Override
	public String peek() {
	      return  data[top - 1];
	}
}

public class TestStack {

	public static void main(String[] args) {
		 Stack s = new StringStack();
		 s.push("Abc");
		 s.push("Xyz");
		 System.out.println(s.peek());
		 System.out.println(s.pop());
		 
	}

}
