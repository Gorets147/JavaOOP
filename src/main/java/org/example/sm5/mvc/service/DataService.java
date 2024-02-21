package org.example.sm5.mvc.service;

import org.example.sm5.mvc.entity.User;

public interface DataService {
    void userCreate(User user);
    User userRead(int studentId);

}
