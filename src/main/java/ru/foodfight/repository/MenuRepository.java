package ru.foodfight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.foodfight.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
