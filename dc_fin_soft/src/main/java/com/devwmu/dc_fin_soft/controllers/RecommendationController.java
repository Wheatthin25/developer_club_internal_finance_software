package com.devwmu.dc_fin_soft.controllers;
import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Recommendation;

// Fix outputs and inputs

@RestController
@RequestMapping("/internal/recommendations")
public class RecommendationController {
    @GetMapping("/total_price")
    public Recommendation calculateRecommendedTotalPrice(){
        // calcRecommendedTotalPrice(qty, pricePerUnit) double
        //     Calculating total price
        //     OUTPUT: recommended total price

        return new Recommendation();
    }

    @GetMapping("/source")
    public Recommendation calculateRecommendedSource(){
        // calcRecommendedSource(totalPrice, type, curDate) str
        //     Recommends a source
        //     OUTPUT: recommended source

        return new Recommendation();
    }
}
