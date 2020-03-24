package ru.foodfight.dto;

public class RestaurantDTO {
    private String name;

    public RestaurantDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
