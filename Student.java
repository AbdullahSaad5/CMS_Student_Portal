package CMS_Student_Portal;

import java.io.*;
import java.util.ArrayList;

public class Student extends Person implements Serializable {
	private String regNo;
	private String semester;
	private String CGPA;
	private String homeCity;
	private String busFacility;

	public Student() {
	}

	public Student(Student obj) {
		super(obj.getUsername(), obj.getPassword(), obj.getName(), obj.getAge(), obj.getEmail());
		this.regNo = obj.regNo;
		this.semester = obj.semester;
		this.CGPA = obj.CGPA;
		this.homeCity = obj.homeCity;
		this.busFacility = obj.busFacility;
	}

	public Student(String username, String password, String name, String age, String email, String regNo,
			String semester, String CGPA, String homeCity, String busFacility) {
		super(username, password, name, age, email);
		this.regNo = regNo;
		this.semester = semester;
		this.CGPA = CGPA;
		this.homeCity = homeCity;
		this.busFacility = busFacility;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getCGPA() {
		return CGPA;
	}

	public void setCGPA(String CGPA) {
		this.CGPA = CGPA;
	}

	public String getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}

	public String getBusFacility() {
		return busFacility;
	}

	public void setBusFacility(String busFacility) {
		this.busFacility = busFacility;
	}

	public static void writeStudentRecord(Student obj) {
		ArrayList<Student> list = readStudentRecord();
		list.add(obj);
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Student Record"));
			output.writeObject(list);
			output.close();
		} catch (Exception e) {
			System.out.println("File Error");
		}
	}

	public static ArrayList<Student> readStudentRecord() {
		ArrayList<Student> list = new ArrayList<Student>();

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Student Record"));
			list = (ArrayList<Student>) input.readObject();
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (Exception e) {
			System.out.println("File Error");
			e.printStackTrace();
		}
		return list;
	}

	public static void display() {
		ArrayList<Student> list = readStudentRecord();
		for (Student Student : list) {
			System.out.println(Student.getName());
		}
	}

	public static ArrayList<Student> search(String name) {
		ArrayList<Student> list = readStudentRecord();
		ArrayList<Student> output = new ArrayList<Student>(10);
		for (Student s : list) {
			if (s.getName().equalsIgnoreCase(name)) {
				output.add(s);
			}
		}
		return output;
	}

	public static ArrayList<Student> searchAdvanced(String name) {
		ArrayList<Student> list = readStudentRecord();
		ArrayList<Student> output = new ArrayList<Student>(10);
		for (Student s : list) {
			String studentName = s.getName();
			if (studentName.equalsIgnoreCase(name)) {
				output.add(s);
				continue;
			}
			// -----------
			String[] names = studentName.split(" ");
			for (String part : names) {
				if (part.equalsIgnoreCase(name)) {
					output.add(s);
					break;
				}
			}

		}
		return output;
	}

	public static String searchAdvancedString(String name) {
		ArrayList<Student> list = readStudentRecord();
		ArrayList<Student> output = new ArrayList<Student>(10);
		for (Student s : list) {
			String studentName = s.getName();
			if (studentName.equalsIgnoreCase(name)) {
				output.add(s);
				continue;
			}
			// -----------
			String[] names = studentName.split(" ");
			for (String part : names) {
				if (part.equalsIgnoreCase(name)) {
					output.add(s);
					break;
				}
			}
		}
		String outputString = "";
		outputString += "\n\n";
		int count = 1;
		if (output.size() == 0) {
			return "\n\n\tNo Search Record Found";
		}
		for (Student s : output) {

			outputString += "\tStudent No. " + count + "\n";
			outputString += "\n\tName: \t" + s.getName();
			outputString += "\n\tReg No: \t" + s.getRegNo();
			outputString += "\n\tEmail: \t" + s.getEmail();
			outputString += "\n\tSemester: \t" + s.getSemester();
			outputString += "\n\tAge: \t" + s.getAge();
			outputString += "\n\tCGPA: \t" + s.getCGPA();
			outputString += "\n\tHome City: \t" + s.getHomeCity();
			outputString += "\n\tBus Facility: \t" + s.getBusFacility();

			outputString += "\n\n\n";
			count++;
		}
		return outputString;

	}

	public static void Delete(String name) {
		ArrayList<Student> S = readStudentRecord();
		for (Student s : S) {
			if (s.getName().equalsIgnoreCase(name)) {
				S.remove(s);
				try (ObjectOutputStream outStream = new ObjectOutputStream(
						new FileOutputStream("Student Record", false))) {
					outStream.writeObject(S);
				} catch (Exception e) {
					System.out.println("File Error");
				}
				return;
			}
		}
		System.out.println("Not found");
	}

	public static void Update(String name, String message, int choice) {
		ArrayList<Student> S = readStudentRecord();

		for (int i = 0; i < S.size(); i++) {
			if (S.get(i).getUsername().equals(name)) {
				if (choice == 1) {
					S.get(i).setUsername(message);
				} else if (choice == 2) {
					S.get(i).setPassword(message);
				} else if (choice == 3) {
					S.get(i).setEmail(message);
				} else if (choice == 4) {
					S.get(i).setHomeCity(message);
				} else if (choice == 5) {
					S.get(i).setBusFacility(message);
				}
				break;
			}
		}

		try {
			ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("Student Record"));
			outStream.writeObject(S);
			outStream.close();
		} catch (Exception e) {
			System.out.println("File Error");
		}
	}

	public static String displayAllStudents() {
		String output = "";
		output += "\n\n";
		ArrayList<Student> list = readStudentRecord();
		int count = 1;
		for (Student s : list) {

			output += "\tStudent No. " + count + "\n";
			output += "\n\tName: \t" + s.getName();
			output += "\n\tReg No: \t" + s.getRegNo();
			output += "\n\tEmail: \t" + s.getEmail();
			output += "\n\tSemester: \t" + s.getSemester();
			output += "\n\tAge: \t" + s.getAge();
			output += "\n\tCGPA: \t" + s.getCGPA();
			output += "\n\tHome City: \t" + s.getHomeCity();
			output += "\n\tBus Facility: \t" + s.getBusFacility();

			output += "\n\n\n";
			count++;
		}
		return output;
	}
}
