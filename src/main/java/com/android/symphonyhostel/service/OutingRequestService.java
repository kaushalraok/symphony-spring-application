package com.android.symphonyhostel.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.symphonyhostel.exception.RecordNotFoundException;
import com.android.symphonyhostel.model.OutingRequestEntity;
import com.android.symphonyhostel.repository.OutingRequestRepository;

@Service
public class OutingRequestService {
	
    @Autowired
    OutingRequestRepository repository;
     
    public List<OutingRequestEntity> getAllRequest()
    {
        List<OutingRequestEntity> RequestList = repository.findAll();
         
        if(RequestList.size() > 0) {
            return RequestList;
        } else {
            return new ArrayList<OutingRequestEntity>();
        }
    }
     
    public OutingRequestEntity getOutingRequestById(Long id) throws RecordNotFoundException
    {
        Optional<OutingRequestEntity> request = repository.findById(id);
         
        if(request.isPresent()) {
            return request.get();
        } else {
            throw new RecordNotFoundException("No student record exist for given id");
        }
    }
     
    public Long createOrUpdateOutingRequest(OutingRequestEntity entity) throws RecordNotFoundException
    {
        Optional<OutingRequestEntity> employee = repository.findById(entity.getRequest_id());
         
        if(employee.isPresent())
        {
        	System.out.println("present");
        	OutingRequestEntity newEntity = employee.get();
            newEntity.setStatus(entity.getStatus());
            newEntity.setParents_remarks(entity.getParents_remarks());
 
            newEntity = repository.save(newEntity);
             
            return entity.getRequest_id();
        } else {
    		entity.setStatus("Pending");
            entity = repository.save(entity);
             
            return entity.getRequest_id();
        }
    }
     
    public void deleteOutingRequestById(Long id) throws RecordNotFoundException
    {
        Optional<OutingRequestEntity> request = repository.findById(id);
         
        if(request.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No student record exist for given id");
        }
    }
    
}
