package com.devwmu.dc_fin_soft.internal.recommendations;
import org.springframework.web.bind.annotation.*;

// Fix outputs and inputs

@RestController
@RequestMapping("/internal/recommendations")
public class RecommendationController {
    @GetMapping("/total_price")
    public CalculateRecommendedTotalPrice calculateRecommendedTotalPrice(){
        // calcRecommendedTotalPrice(qty, pricePerUnit) double
        //     Calculating total price
        //     OUTPUT: recommended total price

        return new CalculateRecommendedTotalPrice();
    }

    @GetMapping("/source")
    public CalculateRecommendedSource calculateRecommendedSource(){
        // calcRecommendedSource(totalPrice, type, curDate) str
        //     Recommends a source
        //     OUTPUT: recommended source

        return new CalculateRecommendedSource();
    }
}
