/**
 * 
 */
package net.rapidhashing.cryptonight;

/**
 * @author matt
 *
 */
public class InvalidOutputLengthException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3013736768471968133L;

	/**
	 * 
	 */
	public InvalidOutputLengthException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public InvalidOutputLengthException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public InvalidOutputLengthException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidOutputLengthException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public InvalidOutputLengthException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
}
