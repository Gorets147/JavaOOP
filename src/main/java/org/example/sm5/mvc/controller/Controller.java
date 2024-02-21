package org.example.sm5.mvc.controller;

import org.example.sm5.mvc.entity.Student;
import org.example.sm5.mvc.entity.StudyGroup;
import org.example.sm5.mvc.entity.Teacher;
import org.example.sm5.mvc.service.StudyGroupService;
import org.example.sm5.mvc.service.UserService;
import org.example.sm5.mvc.view.GroupView;
import org.example.sm5.mvc.view.StudentView;

public class Controller {



    private UserService service;
    private StudentView view;
    private GroupView viewGroup;
    private StudyGroupService sgs;

    public Controller() {
        service = new UserService();
        view = new StudentView();
        sgs = new StudyGroupService();
        viewGroup = new GroupView();
    }

    public void Run(){
        Student student1 = new Student("01.01.1999", "Ivan Ivan Ivan", 1);
        Student student2 = new Student("01.01.1999", "Vanya Vanya Vanya", 2);
        Student student3 = new Student("01.01.1999", "Jhon Jhon Jhon", 3);


        Teacher teacher1 = new Teacher("01.01.1999", "Vasya Vasya Vasya", 1);


        service.userCreate(student1);
        service.userCreate(student2);
        service.userCreate(student3);
        service.userCreate(teacher1);
        sgs.createGroup(teacher1, service.getStudentList());
        sgs.createGroup(teacher1, service.getStudentList());
        sgs.createGroup(teacher1, service.getStudentList());

        Student res = (Student) service.userRead(1);
        StudyGroup resGr = sgs.readGroup(2);
        viewGroup.print(resGr);


    }
}
