package org.example.coursemanagementsystem;

public class ExamCourse extends CourseType {
    // Specific Attribute of the ExamCourse class
    private int totalMarks;

    // Constructor of the class
    public ExamCourse(String courseName, int duration, double coursePrice, int totalMarks){
        super(courseName, duration, coursePrice);
        this.totalMarks = totalMarks;
    }

    // public getter method
    public int getTotalMarks(){
        return totalMarks;
    }

    // Override the method of abstract class
    @Override
    public void evaluate(){
        System.out.println("Exam course evaluation based on total marks: " + getTotalMarks());
    }
}
