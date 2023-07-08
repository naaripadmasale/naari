package com.example.CrudStudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.CrudStudent.DTO.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
