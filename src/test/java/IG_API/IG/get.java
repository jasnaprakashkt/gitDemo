package IG_API.IG;

public class get {
	
	//private int code;
	private String header;
	private int statuscode;
	private String age;
	private String role;
	private String dob;
	private String company;
	private String status;
	 int  code=200;
	get(){
		
	}
	
	public get(int code,String header,int statuscode, String age,String role,String dob,String company,String status) {
		
		//this.code=code;
		this.header=header;
		this.dob=dob;
		this.statuscode=statuscode;
		this.age=age;
		this.role=role;
		this.company=company;
		this.status=status;
		
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

}
