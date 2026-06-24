package com.devwmu.dc_fin_soft.controllers;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;
import com.devwmu.dc_fin_soft.entities.Request;
import com.devwmu.dc_fin_soft.repositories.RequestRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
    @PutMapping("/requests/search")
    public Iterable<Request> filterRequests(@RequestBody Filter[] filters){
        // custom
        // filterRequests(filterArray[]) ? 
        //     Take an array of column names and desired values, and output the selected SQL rows
        //     OUTPUT: requests

        // id: equality
        // community_name: equality/ maybe LIKE
        // requestee_user: equality/ maybe LIKE
        // item_name: equality/ maybe LIKE
        // approval: equality
        // quantity: less than, greater than, equality
        // price_per: less than, greater than, equality
        // deadline: less than, equality
        // purpose: equality/ maybe LIKE
        // deleted: equality
    
        // returns the events that match

        Specification<Request> spec = Specification.unrestricted();
        for (Filter filter: filters){
            String col = filter.getCol();
            String op = filter.getOp().toLowerCase();
            Object value = filter.getVal();

            if (value == null){
                continue;
            }

            Specification<Request> condition = null;
            switch (op) {
                case "like":
                    try{
                        String lower = "%" + value.toString().toLowerCase() + "%";
                        condition =  (root, query, criteraBuilder) ->
                            criteraBuilder.like(criteraBuilder.lower(root.get(col)), lower);
                        break;
                    }
                    catch (ClassCastException e){
                        System.out.println(e + "\n\n\n");
                        break;
                    }
                case "bw":
                    try {
                        ArrayList<String> value2 = (ArrayList<String>) value;
                        LocalDateTime date1 = LocalDateTime.parse(value2.get(0));
                        LocalDateTime date2 = LocalDateTime.parse(value2.get(1));
                        condition =  (root, query, criteraBuilder) ->
                            criteraBuilder.between(root.get(col), date1, date2);

                        break;
                    } catch (ClassCastException e){
                        System.out.println(e + "\n\n\n");
                        break;
                    }
                case "leq": 
                    try{
                        Integer val = (Integer) value;
                        condition =  (root, query, criteraBuilder) ->
                            criteraBuilder.lessThanOrEqualTo(root.get(col), val);
                        break;
                    } catch (ClassCastException e){
                        System.out.println(e + "\n\n\n");
                        break;
                    }
                case "geq":
                    try{
                        Integer val = (Integer) value;
                        condition =  (root, query, criteraBuilder) ->
                            criteraBuilder.greaterThanOrEqualTo(root.get(col), val);
                        break;
                    } catch (ClassCastException e){
                        System.out.println(e + "\n\n\n");
                        break;
                    }
                case "eq":
                    condition = (root, query, criteriaBuilder) -> 
                        criteriaBuilder.equal(root.get(col), value);
                    break;
            }
            
            if (condition != null){
                spec = spec.and(condition);
            }

        }
        return this.requestRepository.findAll(spec);
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

        // do a search of the admins of the database, and email them that a new request has been made
        return new Request();
    }

    @PostMapping("/request_status_updated")
    public Request requestStatusUpdatedNotify(){
        // custom
        // requestStatusUpdatedNotify(requestID, update): bool
        //     Updates the requestee on the request that there has been a change to their request (and what the change is)
        //     OUTPUT: success or not

        // when admin changes approves/disapproves of a request, it will call this funcion
        // take in the id of the request, extract who made the request, and send them an email
        return new Request();
    }
}
