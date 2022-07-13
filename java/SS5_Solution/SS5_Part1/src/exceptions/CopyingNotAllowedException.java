package exceptions;

public class CopyingNotAllowedException extends Exception {

	public CopyingNotAllowedException(){}
	
	public CopyingNotAllowedException(String message)
	{
		super(message);
	}
}
