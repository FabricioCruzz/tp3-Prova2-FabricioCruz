package br.edu.univas.exception;

public class PaymentMethodNotAllowedException extends Exception {

	private static final long serialVersionUID = 7708811962689475611L;
	
	private String message;
	
	public PaymentMethodNotAllowedException(String message) {
		super(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
