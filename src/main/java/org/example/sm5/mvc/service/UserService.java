package org.example.sm5.mvc.service;

import org.example.sm5.mvc.entity.Student;
import org.example.sm5.mvc.entity.Teacher;
import org.example.sm5.mvc.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    List<User> userList = new ArrayList<>();

    @Override
    public void userCreate(User user) {
        int counterStudent = 0;
        int counterTeacher = 0;
        for (User element : userList) {
            if (element instanceof Student) {
                counterStudent++;
            } else {
                counterTeacher++;
            }
        }
        if (user instanceof Student) {
            ((Student) user).setStudentId(counterStudent + 1);
        } else if (user instanceof Teacher) {
            ((Teacher) user).setTeacherId(counterTeacher + 1);
        }
        userList.add(user);
    }

    @Override
    public User userRead(int Id) {
        for (User user : userList) {
            if (user instanceof Student && ((Student) user).getStudentId().equals(Id)){
                return user;
            }
        }
        return null;
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<Student> getStudentList(){
        List<Student> studentList = new ArrayList<>();

        for (User student : userList){
            if (student instanceof Student){
                studentList.add((Student) student);
            }
        }

        return studentList;
    }
}
