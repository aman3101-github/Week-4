package org.example.coursemanagementsystem;

public class AssignmentCourse extends CourseType{

    // Specific Attribute of the AssignmentCourse class
    private int totalAssignments;

    // Constructor of the class
    public AssignmentCourse(String courseName, int duration, double coursePrice, int totalAssignments){
        super(courseName, duration, coursePrice);
        this.totalAssignments = totalAssignments;
    }

    // public getter method
    public int getTotalAssignments(){
        return totalAssignments;
    }

    // Implementation of the abstract method of the super class
    @Override
    public void evaluate() {
        System.out.println("Assignment Course Evaluation: " + totalAssignments);
    }
}
