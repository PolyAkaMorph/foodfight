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
    private Restaurant restaurant;

    @Column(name = "vote_date", nullable = false)
    private LocalDateTime voteTime;

    public Vote(Integer id, User user, Restaurant restaurant, LocalDateTime voteTime) {
        super(id);
        this.user = user;
        this.restaurant = restaurant;
        this.voteTime = voteTime;
    }

    public Vote(Vote vote) {
        this(vote.getId(), vote.getUser(), vote.getRestaurant(), vote.getVoteTime());
    }

    public Vote() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant idRest) {
        this.restaurant = idRest;
    }

    public LocalDateTime getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(LocalDateTime voteTime) {
        this.voteTime = voteTime;
    }
}
