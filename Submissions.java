package CMS_Student_Portal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Submissions implements Serializable {
	public static void writeSubmissionRecord(String reg) {
		ArrayList<String> list = readSubmissionRecord();
		list.add(reg);
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Submission Record"));
			output.writeObject(list);
			output.close();
		} catch (Exception e) {
			System.out.println("File Error");
		}
	}

	public static ArrayList<String> readSubmissionRecord() {
		ArrayList<String> list = new ArrayList<String>();

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Submission Record"));
			list = (ArrayList<String>) input.readObject();
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (Exception e) {
			System.out.println("File Error");
			e.printStackTrace();
		}
		return list;
	}

	public static boolean checkSubmission(String regNo) {
		ArrayList<String> list = readSubmissionRecord();
		for (String reg : list) {
			if (reg.equals(regNo)) {
				return true;
			}
		}
		return false;
	}

	public static boolean allSubmitted() {
		ArrayList<Student> list = Student.readStudentRecord();
		for (Student s : list) {
			if (!checkSubmission(s.getRegNo())) {
				return false;
			}
		}
		return true;
	}
	
	public static void removeAllSubmissions() {
		ArrayList<String> list = new ArrayList<String>();
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Submission Record"));
			output.writeObject(list);
			output.close();
		} catch (Exception e) {
			System.out.println("File Error");
		}
	}
	
	public static String submissionData() {
		String output1 = "\n\n\tStudents that have submitted the assignment are: \n";
		String output2 = "\tStudents that have not submitted the assignment are: \n";
		ArrayList<Student> list = Student.readStudentRecord();
		for (Student s: list) {
			if(checkSubmission(s.getRegNo())) {
				output1 += "\t" + s.getRegNo() + "\n"; 
			}
			else {
				output2 += "\t" + s.getRegNo() + "\n";
 			}
		}
		
		return output1 + "\n" + output2; 
	}
}
