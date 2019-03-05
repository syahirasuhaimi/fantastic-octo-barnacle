package projDb_One;

public class Student {
	
	private int sid;
	private String sname;
	private String sclass;
	private String sphone;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	
	public Student(int sid, String sname, String sclass, String sphone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sclass = sclass;
		this.sphone = sphone;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
