package com.srijan.scrud.service;

import com.srijan.scrud.model.Student;
import com.srijan.scrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public boolean deleteByStudentId(int id){
        try {
            studentRepository.deleteById(id);
            return true;
        }catch (RuntimeException e){
            return false;
        }
    }

    public Student updateByStudent(Student student){
        return studentRepository.save(student);
    }
}
