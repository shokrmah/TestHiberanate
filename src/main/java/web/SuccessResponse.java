package web;

public class SuccessResponse<T> extends BaseResponse {


	/**
	 * 
	 */
	private static final long serialVersionUID = -6925861417036913011L;
	private T data;
	
	public SuccessResponse(T data) {
		super(true);
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
