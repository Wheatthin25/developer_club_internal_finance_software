package com.devwmu.dc_fin_soft.controllers;

import org.springframework.web.bind.annotation.*;
import com.devwmu.dc_fin_soft.entities.Request;
import com.devwmu.dc_fin_soft.repositories.RequestRepository;
import java.util.Optional;

// Fix outputs and inputs

@RestController
@RequestMapping("/requests")
public class RequestController {
    private final RequestRepository requestRepository;

    public RequestController(final RequestRepository requestRepository) {
    this.requestRepository = requestRepository;
  }

    @GetMapping("/requests")
    public Iterable<Request> getAllRequests() {   
        //      OUTPUT: all of the requests

        return this.requestRepository.findAll();
    }
    @GetMapping("/requests/search")
    public Request filterRequests(){
        // custom
        // filterRequests(filterArray[]) ? 
        //     Take an array of column names and desired values, and output the selected SQL rows
        //     OUTPUT: requests

        return new Request();
    }

    @PostMapping("/request")
    public Request createRequest(@RequestBody Request request){
        // createRequest(name, community, username, itemName, quantity, pricePerUnit, deadline, purpose): bool
        //     Creates a new entry in the club requests table
        //     OUTPUT: created request

        return this.requestRepository.save(request);
    }

    @PutMapping("/request/edit_{id}")
    public Request editRequest(@PathVariable("id") Integer id, @RequestBody Request request){
        // editRequest(id, request): bool
        //     The id of the request and the updated request
        //     OUTPUT: the updated request
        Optional<Request> requestToUpdateOptional = this.requestRepository.findById(id);
        if (!requestToUpdateOptional.isPresent()){
            return null;
        }
        Request newRequest = requestToUpdateOptional.get();

        if (request.getCommunityName() != null){
            newRequest.setCommunityName(request.getCommunityName());
        }
        if (request.getRequesteeUser() != null){
            newRequest.setRequesteeUser(request.getRequesteeUser());
        }
        if (request.getItemName() != null){
            newRequest.setItemName(request.getItemName());
        }
        if (request.getApproval() != null){
            newRequest.setApproval(request.getApproval());
        }
        if (request.getQuantity() != null){
            newRequest.setQuantity(request.getQuantity());
        }
        if (request.getPricePerUnit() != null){
            newRequest.setPricePerUnit(request.getPricePerUnit());
        }
        if (request.getDeadline() != null){
            newRequest.setDeadline(request.getDeadline());
        }
        if (request.getPurpose() != null){
            newRequest.setPurpose(request.getPurpose());
        }
        if (request.getDeleted() != null){
            newRequest.setDeleted(request.getDeleted());
        }

        return this.requestRepository.save(newRequest);
    }

    @PutMapping("/request/delete_{id}")
    public Request deleteRequest(@PathVariable("id") Integer id){
        // deleteRequest(id): bool
        //     The id of the request to be deleted (will just set deleted to 1)
        //     OUTPUT: the deleted request
        Optional<Request> requestToUpdateOptional = this.requestRepository.findById(id);
        if (!requestToUpdateOptional.isPresent()){
            return null;
        }
        Request deleteRequest = requestToUpdateOptional.get();
        deleteRequest.setDeleted(1);
        return this.requestRepository.save(deleteRequest);
    }


    @PutMapping("/request/approve_{id}")
    public Request approveRequest(@PathVariable("id") Integer id){
        // approveRequest(id, decision) bool: 
        //     will mark a request as approved/disapproved in the club requests table
        //     OUTPUT: success or not
        Optional<Request> requestToUpdateOptional = this.requestRepository.findById(id);
        if (!requestToUpdateOptional.isPresent()){
            return null;
        }
        Request approveRequest = requestToUpdateOptional.get();
        approveRequest.setApproval(1);
        return this.requestRepository.save(approveRequest);
    }

    @PostMapping("/new_request")
    public Request newRequestNotify(){
        // custom
        // newRequestNotify(RequestID, email(s)): bool
        //     Sends a notification to the admin of the dev club about a new request
        //     OUTPUT: success or not

        return new Request();
    }

    @PostMapping("/request_status_updated")
    public Request requestStatusUpdatedNotify(){
        // custom
        // requestStatusUpdatedNotify(requestID, update): bool
        //     Updates the requestee on the request that there has been a change to their request (and what the change is)
        //     OUTPUT: success or not

        
        return new Request();
    }
}
