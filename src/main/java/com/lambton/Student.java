package com.lambton;

import java.time.LocalDate;
import java.util.Date;

enum gender
{ MALE, FEMALE, OTHERS};

public class Student
{
    int studentId;
    String firstName;
    String lastName;
    Date birthDate;
    gender gender;
    float totalMarks;


    public void setData(int studentId,
            String firstName,
            String lastName,
            Date birthDate,
            gender gender,
            float totalMarks)
    {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.totalMarks = totalMarks;

    }

    public void printData()
    {
        System.out.println("Student ID = " +studentId);
        System.out.println("First Name = " +firstName);
        System.out.println("Last Name = " +lastName);
        System.out.println("Birth date = " +birthDate);
        System.out.println("Gender = " +gender);
        System.out.println("Total Marks = " +totalMarks);
    }


}
