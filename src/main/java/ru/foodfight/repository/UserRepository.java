package ru.foodfight.repository;

import org.springframework.stereotype.Repository;
import ru.foodfight.model.User;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
