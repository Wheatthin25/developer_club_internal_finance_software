package com.devwmu.dc_fin_soft.controllers;

import org.springframework.web.bind.annotation.*;

import com.devwmu.dc_fin_soft.entities.Request;

// Fix outputs and inputs

@RestController
@RequestMapping("/requests")
public class RequestController {
    @GetMapping("/requests/search")
    public Request filterRequests(){
        // filterRequests(filterArray[]) ? 
        //     Take an array of column names and desired values, and output the selected SQL rows
        //     OUTPUT: requests

        return new Request();
    }

    @PostMapping("/request")
    public Request createRequest(){
        // createRequest(name, community, username, itemName, quantity, pricePerUnit, deadline, purpose): bool
        //     Creates a new entry in the club requests table
        //     OUTPUT: success or not

        return new Request();
    }

    @PutMapping("/request/{id}")
    public Request editRequest(){
        // editRequest(id, editArray[]): bool
        //     The id of the request and the array of columns to be changed
        //     OUTPUT: success or not

        return new Request();
    }

    @DeleteMapping("/request{id}")
    public Request deleteRequest(){
        // deleteRequest(id): bool
        //     The id of the request to be deleted (will just set deleted to 0)
        //     OUTPUT: success or not

        return new Request();
    }
}
