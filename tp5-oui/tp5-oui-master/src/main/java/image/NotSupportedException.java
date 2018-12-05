package image;

public class NotSupportedException extends RuntimeException {

	String error;
	public NotSupportedException(String string) {
		this.error = string;
	}
}
