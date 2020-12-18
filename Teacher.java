package CMS_Student_Portal;

import java.io.*;
import java.util.ArrayList;

public class Teacher extends Person implements Serializable {
    private String Field;
    private String Experience;
    private String qualification;

    public Teacher(){}

    public Teacher(String username, String password, String name, String age, String email, String field, String experience, String qualification) {
        super(username, password, name, age, email);
        Field = field;
        Experience = experience;
        this.qualification = qualification;
    }

    public String getField() {
        return Field;
    }

    public void setField(String field) {
        Field = field;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    public static void writeTeacherRecord(Teacher obj) {
        ArrayList<Teacher> list = readTeacherRecord();
        list.add(obj);
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Teacher Record"));
            output.writeObject(list);
            output.close();
        } catch (Exception e) {
            System.out.println("File Error");
        }
    }

    public static ArrayList<Teacher> readTeacherRecord() {
        ArrayList<Teacher> list = new ArrayList<Teacher>();

        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Teacher Record"));
            list = (ArrayList<Teacher>) input.readObject();
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
        ArrayList<Teacher> list = readTeacherRecord();
        for (Teacher teacher : list) {
            System.out.println(teacher.getName());
        }
    }

    public static boolean search(String name){
        ArrayList<Teacher> list = readTeacherRecord();
        for(Teacher s : list){
            if(s.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    public static void Delete(String name){
        ArrayList<Teacher> S = readTeacherRecord();
        for(Teacher s: S){
            if(s.getName().equalsIgnoreCase(name)){
                S.remove(s);
                try(ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("Teacher Record", false))){
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
