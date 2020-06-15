package web;

import java.io.Serializable;

public class BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5905784900056781856L;

	/**
	 * 
	 */

	public BaseResponse(boolean success) {
		super();
		this.success = success;
	}

	private boolean success;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
