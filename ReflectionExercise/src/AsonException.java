import java.lang.reflect.InvocationTargetException;


public class AsonException extends Exception {

	public AsonException(InvocationTargetException e) {
		super(e); // Sets the "cause" - the underlying exception.
		
		
	}

	
}
