package org.example.coursemanagementsystem;

// Abstract Class : Base class for other subclasses
public abstract class CourseType {
    // Encapsulated attributes of the abstract class
    private String courseName;
    private int duration;
    private double courseFee;

    // Constructor of the abstract class
    public CourseType(String courseName, int duration, double courseFee){
        this.courseName = courseName;
        this.duration = duration;
        this.courseFee = courseFee;
    }

    // Getter method for the attributes
    public String getCourseName(){
        return courseName;
    }
    public int getDuration(){
        return duration;
    }
    public double getCourseFee(){
        return courseFee;
    }

    // Abstract method to be implemented by the child classes
    public abstract void evaluate();
}
