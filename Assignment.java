package CMS_Student_Portal;

public class Assignment {
	private Date issueDate = new Date(22, 10, 2020);
	private Date endDate = new Date(22, 10, 2020);
	private int marks;
	
	public Assignment() {}
	public Assignment(Date issueDate, Date endDate, int marks) {
		this.issueDate = issueDate;
		this.endDate = endDate;
		this.marks = marks;
	}


	public Date getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}
}
