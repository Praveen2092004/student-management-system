package com.example.demo;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepo repo;

    // Constructor Injection
    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }

    // Save Student
    public Student saveStudent(Student s) {
        return repo.save(s);
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // Get Student by ID
    public Student getStudentById(int id) {
        return repo.findById(id).orElse(null);
    }

    // Update Student
    public Student updateStudent(Student s) {
        return repo.save(s);
    }

    // Delete Student
    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
}