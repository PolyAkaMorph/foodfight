package ru.foodfight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.foodfight.model.Vote;
import ru.foodfight.repository.VoteRepository;

@Service
@Transactional(readOnly = true)
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public Vote get(Integer id) {
        return voteRepository.getOne(id);
    }

    public void delete(Vote vote) {
        voteRepository.delete(vote);
    }

    public void delete(Integer id) {
        voteRepository.deleteById(id);
    }
}
