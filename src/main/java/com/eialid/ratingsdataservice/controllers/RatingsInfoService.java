package com.eialid.ratingsdataservice.controllers;

import com.eialid.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingsInfoService {

    @RequestMapping("/{movieId}")
    public Rating getRatings(@PathVariable("movieId") int id){
        return new Rating(id, 4);
    }
}
