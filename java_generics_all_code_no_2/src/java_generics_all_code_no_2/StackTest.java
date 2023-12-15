package java_generics_all_code_no_2;

public class StackTest {
    private double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
    private int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

    private Stack<Double> doubleStack; // stack stores Double objects
    private Stack<Integer> integerStack; // stack stores Integer objects

    // test Stack objects
    public void testStacks() {
        doubleStack = new Stack<>(5); // Stack of Doubles
        integerStack = new Stack<>(10); // Stack of Integers

        testPushDouble(); // push double onto doubleStack
        testPopDouble(); // pop from doubleStack
        testPushInteger(); // push int onto intStack
        testPopInteger(); // pop from intStack
   
}
    public void testPushDouble() {
        System.out.println("\nPushing elements onto doubleStack");

        try {
            for (double element : doubleElements) {
                System.out.printf("%.1f ", element);
                doubleStack.push(element); // push onto doubleStack
            }
        } catch (FullStackException fullStackException) {
            System.err.println();
            fullStackException.printStackTrace();
        }
    } // end method testPushDouble
    public void testPopDouble() {
   	 System.out.println("\nPopping elements from doubleStack");

        try {

            double popValue; // store element removed from stack

            while (true) {
                popValue = doubleStack.pop(); // pop from doubleStack
                System.out.printf("%.1f ", popValue);
            } // end while
        } catch (EmptyStackException emptyStackException) {
            System.err.println();
            emptyStackException.printStackTrace();
        } // end catch EmptyStackException
    } // end method testPopDouble
    
    public void testPushInteger() {
        
    	System.out.println("\nPushing elements onto intStack");
        try {
        	
            for (int element : integerElements) {
                System.out.printf("%d ", element);
                integerStack.push(element); // push onto integerStack
            }
        } catch (FullStackException fullStackException) {
            System.err.println();
            fullStackException.printStackTrace();
        }
    } // end method testPushInteger

    public void testPopInteger() {
      	 System.out.println("\nPopping elements from intStack");  

        try {
     
            int popValue; // store element removed from stack

            while (true) {
                popValue = integerStack.pop(); // pop from intStack
                System.out.printf("%d ", popValue);
            } // end while
        } catch (EmptyStackException emptyStackException) {
            System.err.println();
            emptyStackException.printStackTrace();
        } // end catch EmptyStackException
    } // end method testPopInteger

   
    } // end class StackTest

    
