package ru.foodfight.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "menu")
public class Menu extends AbstractEntity{
    @Column(name = "dish_name", nullable = false)
    private String dishName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_restaurant", nullable = false)
    private Restaurant restaurant;

    @Column(name = "menu_date",nullable = false)
    private LocalDate menuDate;

    public Menu() {
    }

    public Menu(Integer id, Restaurant restaurant, LocalDate menuDate) {
        super(id);
        this.restaurant = restaurant;
        this.menuDate = menuDate;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public LocalDate getMenuDate() {
        return menuDate;
    }

    public void setMenuDate(LocalDate menuDate) {
        this.menuDate = menuDate;
    }
}
