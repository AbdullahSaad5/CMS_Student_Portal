package CMS_Student_Portal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Quiz implements Serializable {
	private Time startTime = new Time(0, 0, 0);
	private Time endTime = new Time(0, 0, 0);
	private String title;
	private String teacherComment;

	public Quiz() {
	}

	public Quiz(Quiz obj) {
		this.startTime = obj.startTime;
		this.endTime = obj.endTime;
		this.title = obj.title;
		this.teacherComment = obj.teacherComment;
	}

	public Quiz(Time startTime, Time endTime, String title,  String teacherComment) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.title = title;
		this.teacherComment = teacherComment;
	}

	

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTeacherComment() {
		return teacherComment;
	}

	public void setTeacherComment(String teacherComment) {
		this.teacherComment = teacherComment;
	}

	public static void issueQuiz(Quiz obj) {
		ArrayList<Quiz> list = readQuizRecord();
		list.add(obj);
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Quiz Record"));
			output.writeObject(list);
			output.close();
		} catch (Exception e) {
			System.out.println("File Error");
		}
	}

	public static ArrayList<Quiz> readQuizRecord() {
		ArrayList<Quiz> list = new ArrayList<Quiz>();

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Quiz Record"));
			list = (ArrayList<Quiz>) input.readObject();
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (Exception e) {
			System.out.println("File Error");
		}
		return list;
	}

	public static String display() {
		ArrayList<Quiz> list = readQuizRecord();
		String output = "";
		if (list.size() != 0) {
			output += "\n\n\tTitle: " + list.get(0).getTitle() + "\n";
			output += "\tTeacher Comment: " + list.get(0).getTeacherComment() + "\n";
			output += "\tStart Time: " + list.get(0).getStartTime().getHours() + ":"
					+ list.get(0).getStartTime().getMinutes() + ":" + list.get(0).getStartTime().getSeconds() + "\n";
			output += "\tLast Time: " + list.get(0).getEndTime().getHours() + ":" + list.get(0).getEndTime().getMinutes()
					+ ":" + list.get(0).getEndTime().getSeconds();
			return output;
		} else {
			return "\n\n\t No Quiz Assigned";
		}
	}

	public static void update(Time newTime) {
		ArrayList<Quiz> list = readQuizRecord();
		list.get(0).setEndTime(newTime);
		try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("Quiz Record", false))) {
			outStream.writeObject(list);
		} catch (Exception e) {
			System.out.println("File Error");
		}
		return;
	}

	public static void removeQuizzes() {
		ArrayList<Quiz> list = new ArrayList<Quiz>();
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Quiz Record"));
			output.writeObject(list);
			output.close();
		} catch (Exception e) {
			System.out.println("File Error");
		}
	}

}
