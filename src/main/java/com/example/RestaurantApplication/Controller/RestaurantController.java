package com.example.RestaurantApplication.Controller;

import com.example.RestaurantApplication.Model.Restaurant;
import com.example.RestaurantApplication.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    // http://localhost:8080/restaurant-By-id/{}
    @GetMapping(value="/restaurant-By-id/{id}")
    public Restaurant getRestaurantById(@PathVariable int id){
        return restaurantService.getById(id);
    }

    // http://localhost:8080/getAllRestaurants
    @GetMapping(value="/getAllRestaurants")
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurantsList();
    }

    // http://localhost:8080/addRestaurantsByUser
    @PostMapping(value="/addRestaurantsByUser")
    public void addrestaurant(@RequestBody Restaurant newRestaurant){
        restaurantService.addRestaurants(newRestaurant);
    }

    // http://localhost:8080/updateTheRestaurantsData/id/{id}
    @PutMapping(value="updateTheRestaurantsData/id/{id}")
    public String UpdateTheRestaurantsData(@PathVariable int id , @RequestBody Restaurant UpdatedRestaurant){
        restaurantService.UpdateTheRestaurantsData(id , UpdatedRestaurant);
        return "Data Saved";
    }
    // http://localhost:8080/DeleteTheRestaurant/id/{id}
    @DeleteMapping(value="/DeleteTheRestaurant/id/{id}")
    public void DeleteTheRestaurant(@PathVariable int id){
        restaurantService.DeleteTheRestaurant(id);
    }
}
