package homework.educationCenter.model;

import homework.educationCenter.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Student {

    private String name;
    private String surname;
    private String email;
    private String phone;
    private Date registerDate;
    private Lesson lesson;

    public Student(String name, String surname, String email, String phone, Date registerDate, Lesson lesson) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.lesson = lesson;
        this.registerDate = registerDate;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(email, student.email) && Objects.equals(phone, student.phone) && Objects.equals(registerDate, student.registerDate) && Objects.equals(lesson, student.lesson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, phone, registerDate, lesson);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", registerDate=" + DateUtil.toSimpleDate(registerDate) +
                ", lesson=" + lesson +
                '}';
    }
}
