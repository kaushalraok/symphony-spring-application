package com.android.symphonyhostel.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.symphonyhostel.exception.RecordNotFoundException;
import com.android.symphonyhostel.model.StudentEntity;
import com.android.symphonyhostel.repository.StudentRepository;
 
@Service
public class StudentService {
     
    @Autowired
    StudentRepository repository;
     
    public List<StudentEntity> getAllSudents()
    {
        List<StudentEntity> studentList = repository.findAll();
         
        if(studentList.size() > 0) {
            return studentList;
        } else {
            return new ArrayList<StudentEntity>();
        }
    }
     
    public StudentEntity getStudentById(Long id) throws RecordNotFoundException
    {
    	System.out.println(id);
        Optional<StudentEntity> student = repository.findById(id);
         System.out.println(student);
        if(student.isPresent()) {
            return student.get();
        } else {
            throw new RecordNotFoundException("No student record exist for given id");
        }
    }
     
    public StudentEntity createOrUpdateEmployee(StudentEntity entity) throws RecordNotFoundException
    {
//        Optional<StudentEntity> employee = repository.findById(entity.getStudent_id());
//         
//        if(employee.isPresent())
//        {
//        	StudentEntity newEntity = employee.get();
//             
//            return newEntity;
//        } else {
            entity = repository.save(entity);
             
            return entity;
//        }
    }
     
    public void deleteEmployeeById(Long id) throws RecordNotFoundException
    {
        Optional<StudentEntity> employee = repository.findById(id);
         
        if(employee.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No student record exist for given id");
        }
    }
    
    public Long find(String phnum,String password) throws RecordNotFoundException
    {
    	System.out.println(phnum + " " + password);
        Long student = repository.find(phnum,password);
        System.out.println(student);
         
        if(student!=null) {
            return student;
        } else {
            return null;
    }
    }

}