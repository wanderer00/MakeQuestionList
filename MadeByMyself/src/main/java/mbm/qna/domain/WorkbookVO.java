package mbm.qna.domain;

public class WorkbookVO {
	private Long booknumber;
	private String userid;
	private String workbook;

	@Override
	public String toString() {
		return "WorkbookVO [booknumber=" + booknumber + ", userid=" + userid + ", workbook=" + workbook + "]";
	}
	public Long getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(Long booknumber) {
		this.booknumber = booknumber;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getWorkbook() {
		return workbook;
	}
	public void setWorkbook(String workbook) {
		this.workbook = workbook;
	}
	
	
	
}
