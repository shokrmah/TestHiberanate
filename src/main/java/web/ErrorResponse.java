package web;

public class ErrorResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1497876035963248398L;
	private String description;

	public ErrorResponse(String description) {
		super(false);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
