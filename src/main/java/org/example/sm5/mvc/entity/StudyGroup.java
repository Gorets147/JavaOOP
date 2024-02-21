package org.example.sm5.mvc.entity;

import java.util.List;

public class StudyGroup {

    private Integer groupId;
    private Teacher teacher;
    private List<Student> listOfStudents;

    public StudyGroup(Integer groupId, Teacher teacher, List<Student> listOfStudents) {
        this.groupId = groupId;
        this.teacher = teacher;
        this.listOfStudents = listOfStudents;
    }

    public StudyGroup() {
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Student student : listOfStudents) {
            stringBuilder.append(" id студента: " + student.getStudentId());
            stringBuilder.append(" ФИО: " + student.getFullname());
            stringBuilder.append("\n");
        }

        return "Учебная группа: №" + groupId + "\n" +
                "Преподаватель: " + teacher.getFullname() + "\n" +
                "Студенты:\n" + stringBuilder;
    }
}
