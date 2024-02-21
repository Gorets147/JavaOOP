package org.example.sm5.mvc;

import org.example.sm5.mvc.controller.Controller;
import org.example.sm5.mvc.entity.Student;
import org.example.sm5.mvc.entity.Teacher;
import org.example.sm5.mvc.entity.User;


public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.Run();
    }
}
