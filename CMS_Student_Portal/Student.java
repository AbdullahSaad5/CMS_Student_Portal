package CMS_Student_Portal;

import java.io.*;
import java.util.ArrayList;

public class Student implements Serializable{
    private String name;
    private String regNo;
    private String semester;
    private String age;
    private String CGPA;
    private String homeCity;
    private String busFacility;

    public Student(){}
    public Student(String name, String regNo, String semester, String age, String CGPA, String homeCity,
                   String busFacility){
        this.name = name;
        this.regNo = regNo;
        this.semester = semester;
        this.age = age;
        this.CGPA = CGPA;
        this.homeCity = homeCity;
        this.busFacility = busFacility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        catch(Exception e){
            System.out.println("File Error");
        }
        return list;
    }
    public static void display(){
        ArrayList<Student> list = readStudentRecord();
        for (Student Student : list) {
            System.out.println(Student.getName());
        }
    }

    public static boolean search(String name){
        ArrayList<Student> list = readStudentRecord();
        for(Student s : list){
            if(s.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    public static void Delete(String name){
        ArrayList<Student> S = readStudentRecord();
        for(Student s: S){
            if(s.getName().equalsIgnoreCase(name)){
                S.remove(s);
                try(ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("Student Record", false))){
                    outStream.writeObject(S);
                }
                catch(Exception e){
                    System.out.println("File Error");
                }
                return;
            }
        }
        System.out.println("Not found");
    }
    public static void Update(String newSem,String name){
        ArrayList<Student> S = readStudentRecord();

        for(int i=0;i<S.size();i++){
            if(S.get(i).getName().equalsIgnoreCase(name)){
                S.get(i).setSemester(newSem);
                try(ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("Student Record", false))){
                    outStream.writeObject(S);
                }
                catch(Exception e){
                    System.out.println("File Error");
                }
                return;
            }
        }
        System.out.println("Not found");
    }
}


//    public void submitAssignment();
//    public void submitQuiz();
//    public void viewResultCard();
//    public void viewProfile();
//    public void viewFee();
//    public void logout();
//    public void viewDashboard();
//    public void viewRegisteredCourses();
