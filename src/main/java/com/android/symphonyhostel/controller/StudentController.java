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
import com.android.symphonyhostel.model.StudentEntity;
import com.android.symphonyhostel.service.StudentService;
@CrossOrigin("*")
@RestController
@RequestMapping("/students")
public class StudentController
{
    @Autowired
    StudentService service;
 
    @GetMapping
    public ResponseEntity<List<StudentEntity>> getAllEmployees() {
        List<StudentEntity> list = service.getAllSudents();
 
        return new ResponseEntity<List<StudentEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable("id") Long id)
                                                    throws RecordNotFoundException {
        StudentEntity entity = service.getStudentById(id);
        System.out.println(entity);
        return new ResponseEntity<StudentEntity>(entity, new HttpHeaders(), HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.POST, path="/insert")
    public int createOrUpdateEmployee(@RequestBody StudentEntity employee)
                                                    throws RecordNotFoundException {
    	System.out.println(employee);
    	service.createOrUpdateEmployee(employee);
        return 1;
    }
    
    @GetMapping("/login/{phnum}/{password}")
    public Long find(@PathVariable("phnum") String phnum,@PathVariable("password") String password)
                                                    throws RecordNotFoundException {
    	Long data = service.find(phnum,password);
    	System.out.println(data);
        return data;
    }
 
    @DeleteMapping("/{id}")
    public HttpStatus deleteEmployeeById(@PathVariable("id") Long id)
                                                    throws RecordNotFoundException {
        service.deleteEmployeeById(id);
        return HttpStatus.FORBIDDEN;
    }
 
}