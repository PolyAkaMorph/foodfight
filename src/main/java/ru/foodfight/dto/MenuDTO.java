package ru.foodfight.dto;


import java.util.List;
import java.util.Objects;

public class MenuDTO {
    private RestaurantDTO restaurant;
    private List<MealDTO> mealList;

    public MenuDTO(String restaurant, List<MealDTO> mealList) {
        this.restaurant = new RestaurantDTO(restaurant);
        this.mealList = mealList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuDTO menuDTO = (MenuDTO) o;
        return restaurant.equals(menuDTO.restaurant) &&
                mealList.equals(menuDTO.mealList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restaurant, mealList);
    }

    public MenuDTO() {
    }

    public RestaurantDTO getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantDTO restaurant) {
        this.restaurant = restaurant;
    }

    public List<MealDTO> getMealList() {
        return mealList;
    }

    public void setMealList(List<MealDTO> mealList) {
        this.mealList = mealList;
    }
}
