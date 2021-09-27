package com.mycompany.question_1;

import java.util.Scanner;

public class Student 
{
    private String Name;
    private String Rollnumber;
    private double Marks;
    private double attendance; //attendance is in percentage

    Scanner myObj = new Scanner(System.in);

    public Student()
    {
        Name = null;
        Rollnumber = null;
        Marks = 0;
        attendance = 0;         //constructor
    }

    public String getName()
    {
        return Name;                    //getter
    }
    public void setName(String name)
    {
        Name = name;                     //setter
    }
    public String getRollnumber()
    {
        return Rollnumber;                    //getter
    }
    public void setRollnumber(String i)
    {
        Rollnumber = i;               //setter
    }
    public double getMarks()
    {
        return Marks;                          //getter
    }
    public void setMarks(int marks)
    {
        Marks = marks;                       //setter
    }
    public double getAttendance()
    {
        return attendance;                    //getter
    }
    public void setAttendance(double attendance)
    {
        this.attendance = attendance;          //setter
    }


    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args)
    {


        Student student1 = new Student();
        Student student2 = new Student();


        student1.setMarks(95);
        student1.setName("Abhishek");
        student1.setAttendance(85);
        student1.setRollnumber("20EE10033");

        student2.setMarks(75);
        student2.setName("Krishnaprasad");
        student2.setAttendance(65);
        student2.setRollnumber("20EC10043");


        System.out.println( "Before: " + student1.getName() + "  " +  student1.getRollnumber() + "  " + student1.getMarks() + "  " + student1.getAttendance());

        System.out.println("Before: " + student2.getName() + "  " + student2.getRollnumber() + "  " + student2.getMarks() + "  " + student2.getAttendance());

        if(student1.attendance > 75)
        {
            student1.Marks = student1.Marks + 0.1 * student1.Marks;
            if(student1.Marks > 100)
            {
                student1.setMarks(100);
            }
        }

        if(student2.attendance > 75)
        {
            student2.Marks = student2.Marks + 0.1 * student2.Marks;
            if(student2.Marks > 100)
            {
                student2.setMarks(100);
            }
        }

        System.out.println( "After: " + student1.getName() + "  " +  student1.getRollnumber() + "  " + student1.getMarks() + "  " + student1.getAttendance());

        System.out.println("After: " + student2.getName() + "  " + student2.getRollnumber() + "  " + student2.getMarks() + "  " + student2.getAttendance());




    }
    
}
