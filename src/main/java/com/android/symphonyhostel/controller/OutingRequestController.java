package com.android.symphonyhostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.android.symphonyhostel.exception.RecordNotFoundException;
import com.android.symphonyhostel.model.OutingRequestEntity;
import com.android.symphonyhostel.service.OutingRequestService;


@CrossOrigin("*")
@RestController
@RequestMapping("/outingrequest")
public class OutingRequestController {
	
	 @Autowired
	 OutingRequestService service;
	 
	    @GetMapping
	    public ResponseEntity<List<OutingRequestEntity>> getAllRequest() {
	        List<OutingRequestEntity> list = service.getAllRequest();
	 
	        return new ResponseEntity<List<OutingRequestEntity>>(list, new HttpHeaders(), HttpStatus.OK);
	    }
	 
	    @GetMapping("/{id}")
	    public ResponseEntity<OutingRequestEntity> getOutingRequestById(@PathVariable("id") Long id)
	                                                    throws RecordNotFoundException {
	    	OutingRequestEntity entity = service.getOutingRequestById(id);
	 
	        return new ResponseEntity<OutingRequestEntity>(entity, new HttpHeaders(), HttpStatus.OK);
	    }
	 
	    @RequestMapping(method = RequestMethod.POST, path="/insert")
	    public Long createOrUpdateOutingRequest(@RequestBody OutingRequestEntity outingrequest)
	                                                    throws RecordNotFoundException {
	    	Long id;
	    	System.out.println(outingrequest);
	    	id = service.createOrUpdateOutingRequest(outingrequest);
	        return id;
	    }
	    
	 
	    @DeleteMapping("/{id}")
	    public HttpStatus deleteOutingRequestById(@PathVariable("id") Long id)
	                                                    throws RecordNotFoundException {
	        service.deleteOutingRequestById(id);
	        return HttpStatus.FORBIDDEN;
	    }

}
