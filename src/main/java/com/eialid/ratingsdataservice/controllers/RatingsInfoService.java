package com.eialid.ratingsdataservice.controllers;

import com.eialid.ratingsdataservice.models.Rating;
import com.eialid.ratingsdataservice.models.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsInfoService {

    @RequestMapping("/{movieId}")
    public Rating getRatings(@PathVariable("movieId") int id){
        return new Rating(id, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRatings getAllRatedMovies(@PathVariable("userId") int userId){
        List<Rating> ratings = Arrays.asList(
                new Rating(650, 4),
                new Rating(550, 5)
        );
        UserRatings userRatings=new UserRatings();
        userRatings.setUserRatings(ratings);

        return userRatings;
    }
}
