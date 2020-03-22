package ru.foodfight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.foodfight.model.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote,Integer> {
}
