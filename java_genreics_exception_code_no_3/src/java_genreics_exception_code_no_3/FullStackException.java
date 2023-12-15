package java_genreics_exception_code_no_3;

public class FullStackException extends Exception {

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
