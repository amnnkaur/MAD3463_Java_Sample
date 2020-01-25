package com.lambton;



import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class StudentMain
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setData(1, "Aman","Kaur", new Date(), gender.FEMALE,250);
        s1.printData();

       /* LocalDate s1BirthDate = LocalDate.of(1992, Month.JANUARY, 24);
        LocalDate today= LocalDate.now();
        today.getYear();*/
    }


}
