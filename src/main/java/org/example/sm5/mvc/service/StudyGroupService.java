package org.example.sm5.mvc.service;

import org.example.sm5.mvc.entity.Student;
import org.example.sm5.mvc.entity.StudyGroup;
import org.example.sm5.mvc.entity.Teacher;
import org.example.sm5.mvc.entity.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService{

    List<StudyGroup> groupList = new ArrayList<>();

    public void createGroup (Teacher teacher, List<Student> studentList){
        int counterGroup = 0;
        StudyGroup group = new StudyGroup();
        for (StudyGroup studyGroup : groupList) {
            counterGroup++;
        }
        group.setGroupId(counterGroup + 1);
        group.setTeacher(teacher);
        group.setListOfStudents(studentList);
        groupList.add(group);
    }

    public StudyGroup readGroup (int id){
        for (StudyGroup group : groupList) {
            if (group.getGroupId().equals(id)){
                return group;
            }
        }
        return null;
    }
}
