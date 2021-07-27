package com.srijan.scrud.model;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "first_name")
    private String fristName;
    @Column(name="last_name")
    private String lastName;
    @Column(name = "roll_number")
    private String rollNumber;
    private String gender;
    private String discipline;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setFristName(String fristName){
        this.fristName = fristName;
    }

    public String getFristName(){
        return this.fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}
