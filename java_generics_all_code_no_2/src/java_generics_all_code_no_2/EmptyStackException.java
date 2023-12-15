package java_generics_all_code_no_2;

public class EmptyStackException extends RuntimeException
 {
 // no-argument constructor
 public EmptyStackException()
 {
 this("Stack is empty:" );
 } // end no-argument EmptyStackException constructor

 // one-argument constructor
 public EmptyStackException( String exception )
 {
 super( exception );
 } // end one-argument EmptyStackException constructor
 } // end class EmptyStackException
