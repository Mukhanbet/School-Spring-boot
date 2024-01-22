package com.example.Spring.project2.repositories;

import com.example.Spring.project2.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);
    Optional<Student> findByEmail(String email);
}
