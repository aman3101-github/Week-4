package org.example.coursemanagementsystem;

/* Generic class to handle all the subclasses of the CourseType abstract class
    Course<T> --> Basic generic class that works with specific datatype
    class ClassName<T extends ParentClass> --> Bounded type parameter
    Course<T extends CourseType> --> Course is a generic class which works with the subclasses
                                     of the class CourseType, otherwise Compile Time Error
 */
public class Course<T extends CourseType>{
    // Specific Attributes of the Course generic class
    private T courseType;

    // Constructor of the generic class
    public Course(T courseType){
        this.courseType = courseType;
    }

    // Method to display details
    public void displayCourseDetails(){
        System.out.println("Course Name: " + courseType.getCourseName());
        System.out.println("Duration: " + courseType.getDuration());
        courseType.evaluate(); // Calling the overridden method
    }

}
