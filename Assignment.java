package CMS_Student_Portal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Assignment implements Serializable {
	private Date startDate = new Date(22, 10, 2020);
	private Date lastDate = new Date(22, 10, 2020);
	private String title;
	private float fileSize;
	private String fileType;
	private String teacherComment;

	public Assignment() {
	}
	public Assignment(Assignment obj) {
		this.startDate = obj.startDate;
		this.lastDate = obj.lastDate;
		this.title = obj.title;
		this.fileSize = 2048;
		this.fileType = obj.fileType;
		this.teacherComment = obj.teacherComment;
	}

	public Assignment(Date startDate, Date lastDate, String title, String fileType, String teacherComment) {
		this.startDate = startDate;
		this.lastDate = lastDate;
		this.title = title;
		this.fileSize = 2048;
		this.fileType = fileType;
		this.teacherComment = teacherComment;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = new Date(startDate);
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = new Date(lastDate);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getFileSize() {
		return fileSize;
	}

	public void setFileSize(float fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getTeacherComment() {
		return teacherComment;
	}

	public void setTeacherComment(String teacherComment) {
		this.teacherComment = teacherComment;
	}

	public static void issueAssignment(Assignment obj) {
		ArrayList<Assignment> list = readAssignmentRecord();
		list.add(obj);
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Assignment Record"));
			output.writeObject(list);
			output.close();
		} catch (Exception e) {
			System.out.println("File Error");
		}
	}

	public static ArrayList<Assignment> readAssignmentRecord() {
		ArrayList<Assignment> list = new ArrayList<Assignment>();

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Assignment Record"));
			list = (ArrayList<Assignment>) input.readObject();
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (Exception e) {
			System.out.println("File Error");
		}
		return list;
	}

	public static void display() {
		ArrayList<Assignment> list = readAssignmentRecord();
		for (Assignment Assignment : list) {
			System.out.println(Assignment.getTitle());
		}
	}

	public static void Update(Date newDate) {
		ArrayList<Assignment> list = readAssignmentRecord();
		list.get(0).setLastDate(newDate);
		try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("Assignment Record", false))) {
			outStream.writeObject(list);
		} catch (Exception e) {
			System.out.println("File Error");
		}
		return;
	}

	public static void removeAssignments() {
		ArrayList<Assignment> list = new ArrayList<Assignment>();
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Assignment Record"));
			output.writeObject(list);
			output.close();
		} catch (Exception e) {
			System.out.println("File Error");
		}
	}

}
