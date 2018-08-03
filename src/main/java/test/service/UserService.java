package test.service;

import test.beans.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void createUser(String name, String email, String password);

    void removeUserById(int Id);

    Optional<User> findUserById(int id);

    List<User> findAllUsers();

}
