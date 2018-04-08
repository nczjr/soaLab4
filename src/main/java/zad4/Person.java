package zad4;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class Person implements Serializable {

    private String sex;
    private String name;
    private String email;
    private int age;
    private String education;
    private int height;

    public Person() {
    }

    public Person(String sex, String name, String email, int age, String education, int height) {
        this.sex = sex;
        this.name = name;
        this.email = email;
        this.age = age;
        this.education = education;
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", height=" + height +
                '}';
    }
}
