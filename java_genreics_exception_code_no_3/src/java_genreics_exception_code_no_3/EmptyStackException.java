package java_genreics_exception_code_no_3;

public class EmptyStackException extends Exception {
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

