package com.sushforyou.restaurantlisting.controller;

import com.sushforyou.restaurantlisting.dto.RestaurantDTO;
import com.sushforyou.restaurantlisting.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @GetMapping("/fetchAllRestaurant")
    public ResponseEntity fetchAllRestaurant(){
        List<RestaurantDTO> allRestaurants = restaurantService.findAllRestaurant();
        return  new ResponseEntity(allRestaurants, HttpStatus.OK);
    }
    @PostMapping("/addRestaurant")
    public ResponseEntity saveRestaurant(@RequestBody RestaurantDTO restaurantDTO){
        RestaurantDTO restaurantAdded = restaurantService.addRestaurnt(restaurantDTO);
        return new ResponseEntity(restaurantAdded, HttpStatus.CREATED);
    }

    @GetMapping("fetchById/{id}")
    public ResponseEntity<RestaurantDTO> findRestaurantById(@PathVariable Integer id) {
        return restaurantService.fetchRestaurantById(id);
    }

}
