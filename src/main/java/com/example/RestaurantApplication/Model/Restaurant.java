package com.example.RestaurantApplication.Model;

public class Restaurant {

    private int id;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantNumber;
    private String specialty;
    private int totalStaff;
    private double rating;

    public Restaurant(int id, String restaurantName, String restaurantAddress, String restaurantNumber, String specialty, int totalStaff, double rating) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantNumber = restaurantNumber;
        this.specialty = specialty;
        this.totalStaff = totalStaff;
        this.rating = rating;
    }

    public Restaurant() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(String restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", restaurantName='" + restaurantName + '\'' +
                ", restaurantAddress='" + restaurantAddress + '\'' +
                ", restaurantNumber='" + restaurantNumber + '\'' +
                ", specialty='" + specialty + '\'' +
                ", totalStaff=" + totalStaff +
                ", rating=" + rating +
                '}';
    }
}
