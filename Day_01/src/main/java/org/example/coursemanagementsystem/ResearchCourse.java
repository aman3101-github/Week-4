package org.example.coursemanagementsystem;

public class ResearchCourse extends CourseType{

    // Specific Attribute of the AssignmentCourse class
    private String researchTopic;

    // Constructor of the class
    public ResearchCourse(String courseName, int duration, double coursePrice, String researchTopic){
        super(courseName, duration, coursePrice);
        this.researchTopic = researchTopic;
    }

    // public getter method
    public String getTotalAssignments(){
        return researchTopic;
    }

    // Implementation of the abstract method of the super class
    @Override
    public void evaluate() {
        System.out.println("Research Course Evaluation: " + researchTopic);
    }
}

