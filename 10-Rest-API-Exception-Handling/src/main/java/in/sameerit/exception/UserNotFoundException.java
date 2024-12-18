package in.sameerit.exception;

public class UserNotFoundException extends RuntimeException {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4106860023516093939L;

	public UserNotFoundException() {
		

	}
	
	public UserNotFoundException(String msg) {
		super(msg);

	}


}
