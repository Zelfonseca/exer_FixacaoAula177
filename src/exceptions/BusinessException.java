package exceptions;

public class BusinessException extends RuntimeException{
//método
	private static final long serialVersionUID = 1L;

	// construtor
	public BusinessException (String msg) {
		super(msg);
	}
	
	
}
