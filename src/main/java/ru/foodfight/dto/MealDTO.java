package ru.foodfight.dto;

import java.util.Objects;

public class MealDTO {
    private String name;
    private double price;

    public MealDTO(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MealDTO mealDTO = (MealDTO) o;
        return Double.compare(mealDTO.price, price) == 0 &&
                name.equals(mealDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public MealDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
