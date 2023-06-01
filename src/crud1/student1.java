package crud1;


public class student1 {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private  int studentStandard;
	private String studentDivision;
	
	public student1(int studentId, String studentName, String studentEmail, int studentStandard,
			String studentDivision) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentStandard = studentStandard;
		this.studentDivision = studentDivision;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public int getStudentStandard() {
		return studentStandard;
	}

	public void setStudentStandard(int studentStandard) {
		this.studentStandard = studentStandard;
	}

	public String getStudentDivision() {
		return studentDivision;
	}

	public void setStudentDivision(String studentDivision) {
		this.studentDivision = studentDivision;
	}

	@Override
	public String toString() {
		return "student1 [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentStandard=" + studentStandard + ", studentDivision=" + studentDivision + "]";
	}
	
	
	
}
