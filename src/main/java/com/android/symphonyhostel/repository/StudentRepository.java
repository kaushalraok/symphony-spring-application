package com.android.symphonyhostel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.android.symphonyhostel.model.StudentEntity;
 
@Repository
public interface StudentRepository
        extends JpaRepository<StudentEntity, Long> {
	
    @Query(value="SELECT student_id from students where phnum=(:phnum) and password=(:password)", nativeQuery = true)
    public Long find(@Param("phnum") String phnum,@Param("password") String password);
 
}