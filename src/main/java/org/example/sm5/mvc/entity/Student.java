package org.example.sm5.mvc.entity;

public class Student extends User {
    private Integer studentId;

    public Student(String birthday, String fullname, Integer studentId) {
        super(birthday, fullname);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", birthday='" + birthday + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }
}
