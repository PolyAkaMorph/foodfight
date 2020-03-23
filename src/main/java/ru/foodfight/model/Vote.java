package ru.foodfight.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vote")
public class Vote extends AbstractEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_restaurant", nullable = false)
    private Restaurant restaraunt;

    @Column(name = "vote_time", nullable = false)
    private LocalDateTime voteTime;

    public Vote(Integer id, User user, Restaurant restaraunt, LocalDateTime voteTime) {
        super(id);
        this.user = user;
        this.restaraunt = restaraunt;
        this.voteTime = voteTime;
    }

    public Vote() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaraunt() {
        return restaraunt;
    }

    public void setRestaraunt(Restaurant idRest) {
        this.restaraunt = idRest;
    }

    public LocalDateTime getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(LocalDateTime voteTime) {
        this.voteTime = voteTime;
    }
}
