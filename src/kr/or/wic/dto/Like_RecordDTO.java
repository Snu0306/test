package kr.or.wic.dto;

public class Like_RecordDTO {
	private String send_id;
	private String get_id;
	public String getSend_id() {
		return send_id;
	}
	public void setSend_id(String send_id) {
		this.send_id = send_id;
	}
	public String getGet_id() {
		return get_id;
	}
	public void setGet_id(String get_id) {
		this.get_id = get_id;
	}
	@Override
	public String toString() {
		return "Like_RecodeDTO [send_id=" + send_id + ", get_id=" + get_id + "]";
	}
	
	
	
}
