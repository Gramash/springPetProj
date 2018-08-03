package test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.beans.User;

/**
 * This is going to be AUTO IMPLEMENTED by Spring into a Bean
 * with the name userRepository (current class name starting with a lower case letter).
 *
 * Generic operations are going to be created for class {@link User} since
 * CrudRepository is parametrized with User.
 * The second parametrized value {@link Integer} stands for id type in DataBase
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
