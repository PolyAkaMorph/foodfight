package ru.foodfight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.foodfight.model.User;
import ru.foodfight.repository.UserRepository;

@Service
@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User get(int id) {
        return userRepository.findById(id).orElse(null);
    }

}
