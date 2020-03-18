package ru.foodfight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.foodfight.model.User;
import ru.foodfight.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User get(int id) {
        Optional<User> optional = userRepository.findById(id);
        return optional.get();
    }

}
