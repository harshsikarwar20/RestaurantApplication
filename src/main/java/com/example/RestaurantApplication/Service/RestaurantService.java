package com.example.RestaurantApplication.Service;
import com.example.RestaurantApplication.Model.Restaurant;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    static ArrayList<Restaurant> list = new ArrayList<>();

    static{
        list.add((new Restaurant(1,"Tansen Residency" , "City center Gwalior" , "552244" , "Marriage halls and residency" , 110 , 4.0)));
        list.add((new Restaurant(2,"vansen Residency" , "oti City center Gwalior" , "552244" , "Marriage halls" , 11 , 3.0)));
        list.add((new Restaurant(3,"Aditya's Hotel" , "Aditya puram Gwalior" , "5587843245" , "Best rooms services" , 500 , 5.0)));
    }

    public Restaurant getById(int id) {
        for(int i=0; i<list.size(); i++){
            JSONObject obj = new JSONObject(list.get(i));
            int idNumber = obj.getInt("id");
            if(idNumber==id){
                return list.get(i);
            }
        }
        return null;
    }

    public List<Restaurant> getAllRestaurantsList() {
        return list;
    }

    public void addRestaurants(Restaurant newRestaurant) {
        list.add(newRestaurant);
    }
    public void UpdateTheRestaurantsData(int id , Restaurant newData) {
        for(int i=0; i<list.size(); i++){
            JSONObject obj = new JSONObject(list.get(i));
            int idNumber = obj.getInt("id");
            if(idNumber==id){
                JSONObject obje = new JSONObject(newData);
                list.get(i).setId(obje.getInt("id"));
                list.get(i).setRestaurantName(obje.getString("restaurantName"));
                list.get(i).setRestaurantAddress(obje.getString("restaurantAddress"));
                list.get(i).setRestaurantNumber(obje.getString("restaurantNumber"));
                list.get(i).setSpecialty(obje.getString("specialty"));
                list.get(i).setTotalStaff(obje.getInt("totalStaff"));
                list.get(i).setRating(obje.getDouble("rating"));
            }
        }
    }
    public void DeleteTheRestaurant(int id) {
        for(int i=0; i<list.size(); i++){
            JSONObject obj = new JSONObject(list.get(i));
            int idNumber = obj.getInt("id");
            if(idNumber==id){
                list.remove(i);
            }
        }
    }
}
