package java_generics_all_code_no_2;

public class FullStackException extends RuntimeException
 {
 // no-argument constructor
 public FullStackException()
 {
 this("Stack is full:");
 } // end no-argument FullStackException constructor

 // one-argument constructor
 public FullStackException( String exception )
 {
super( exception );
 } // end one-argument FullStackException constructor
 } // end class FullStackException