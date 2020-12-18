package CMS_Student_Portal;

import java.io.Serializable;

public class Person implements Serializable {
    private String username;
    private String password;
    private String name;
    private String age;
    private String email;

    public Person(){}
    public Person(String username, String password, String name, String age, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
