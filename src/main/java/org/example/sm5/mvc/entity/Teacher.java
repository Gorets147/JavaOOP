package org.example.sm5.mvc.entity;

import org.example.sm5.mvc.entity.User;

public class Teacher extends User {
    private Integer teacherId;

    public Teacher(String birthday, String fullname, Integer teacherId) {
        super(birthday, fullname);
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", birthday='" + birthday + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }
}
