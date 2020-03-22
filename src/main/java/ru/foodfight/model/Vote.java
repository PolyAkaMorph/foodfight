package ru.foodfight.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "VOTE")
public class Vote extends AbstractEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Column(name = "ID_RESTARAUNT", nullable = false)
    private Integer idRest;

    @Column(name = "VOTE_TIME", nullable = false)
    private LocalDateTime voteTime;

    public Vote(Integer id, User user, Integer idRest, LocalDateTime voteTime) {
        super(id);
        this.user = user;
        this.idRest = idRest;
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

    public Integer getIdRest() {
        return idRest;
    }

    public void setIdRest(Integer idRest) {
        this.idRest = idRest;
    }

    public LocalDateTime getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(LocalDateTime voteTime) {
        this.voteTime = voteTime;
    }
}
