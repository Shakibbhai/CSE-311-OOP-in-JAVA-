package java_genreics_exception_code_no_3;

import java.util.Stack;

public class StackTest2 {
 private Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
private Integer[] integerElements ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
 private Stack<Double>doubleStack; // stack stores Double objects
 private Stack<Integer> integerStack; // stack stores Integer objects

// test Stack objects
 public void testStacks()
 {
doubleStack = new Stack<Double>( ); // Stack of Doubles
 integerStack = new Stack<Integer>(10); // Stack of Integers

testPush("doubleStack", doubleStack, doubleElements );
testPop("doubleStack", doubleStack );
 testPush("integerStack", integerStack, integerElements );
 testPop("integerStack", integerStack );
} // end method testStacks
 public<T> void testPush( String name, Stack<T> stack, T[] elements )
 {
 // push elements onto stack
  try
 {
 System.out.printf("\nPushing elements onto %s\n", name );
 
 // push elements onto Stack
 for ( T element : elements )
 {
 System.out.printf("%s", element );
  stack.push( element ); // push element onto stack
 }
  } // end try
 catch (FullStackException fullStackException )
  {
  System.out.println();
 fullStackException.printStackTrace();
  } // end catch FullStackException
  }
 // end method testPush
 
 public <T> void testPop(String name, Stack<T> stack) throws EmptyStackException {
     System.out.printf("\nPopping elements from %s\n", name);
	 T popValue;

	 while (true) {
	     popValue = stack.pop();
	     System.out.printf("%s ", popValue);
	 }
 }

 public static void main(String args[]) {
     StackTest2 application = new StackTest2();
     application.testStacks();
 }
}
