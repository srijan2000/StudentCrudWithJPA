package com.srijan.scrud.service;

import com.srijan.scrud.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void createStudentTest(){ //creating a student record
        Student student = new Student() ;
        student.setFristName("Vinny");
        student.setLastName("Veerareddy");
        student.setGender("Female");
        student.setRollNumber("9999");
        student.setDiscipline("CS");

        Student newStudent = studentService.save(student);
        assertNotNull(newStudent);
    }

    @Test
    public void getAllStudentsTest(){//fetching students records
        List<Student> studentList = studentService.getAllStudents();

        assertNotNull(studentList);
        assertTrue(studentList.size() > 0);
    }

    @Test
    public void deleteStudentByIdTest(){
        boolean flag = studentService.deleteByStudentId(3);
        assertTrue(flag);
    }

    @Test
    void updateStudentTest(){

        Student student = new Student();
        student.setId(1);
        student.setFristName("Srijan");
        student.setLastName("Veerareddy");
        student.setGender("Male");
        student.setDiscipline("CS");
        student.setRollNumber("12346");
        Student newStudent = studentService.updateByStudent(student);

        assertNotNull(newStudent);
    }

}