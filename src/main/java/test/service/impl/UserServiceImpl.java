package test.service.impl;

import org.springframework.stereotype.Component;
import test.beans.User;
import test.repository.UserRepository;
import test.service.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

//TODO: Think about exception handling
@Component
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public void createUser(String name, String email, String password) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        userRepository.save(user);
    }

    @Override
    public void removeUserById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> findUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
