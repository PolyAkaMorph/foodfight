package ru.foodfight.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.foodfight.model.User;
import org.springframework.data.repository.CrudRepository;

@Repository
@Component
public interface UserRepository extends CrudRepository<User, Integer> {
}
