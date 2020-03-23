package ru.foodfight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.foodfight.model.User;
import ru.foodfight.repository.UserRepository;

import javax.persistence.EntityManager;

@Service
@Transactional(readOnly = true)
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    EntityManager entityManager;

    public User get(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

}
