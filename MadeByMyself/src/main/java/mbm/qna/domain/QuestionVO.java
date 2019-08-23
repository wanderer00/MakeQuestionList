package mbm.qna.domain;

public class QuestionVO {

	private int booknumber;
	private int qnumber;
	private String qname;
	private int anumber;
	private String aname;
	private String yorn = "N";
	
	@Override
	public String toString() {
		return "QuestionVO [booknumber=" + booknumber + ", qnumber=" + qnumber + ", qname=" + qname + ", anumber="
				+ anumber + ", aname=" + aname + ", yorn=" + yorn + "]";
	}
	public int getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}
	public int getQnumber() {
		return qnumber;
	}
	public void setQnumber(int qnumber) {
		this.qnumber = qnumber;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public int getAnumber() {
		return anumber;
	}
	public void setAnumber(int anumber) {
		this.anumber = anumber;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getYorn() {
		return yorn;
	}
	public void setYorn(String yorn) {
		this.yorn = yorn;
	}
	
	
	
	
	
	

}
