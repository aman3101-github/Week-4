package org.example.resumescreeningsystem;

// Generic class Resume to handle resumes
public class Resume<T extends JobRole> {
    private T role;

    // Constructor
    public Resume(T role) {
        this.role = role;
    }

    // Display Resume Details
    public void displayResume() {
        System.out.println("Candidate Name: " + role.getCandidateName());
        System.out.println("Applying for: " + role.getJobRole());
        System.out.println("Experience Level: " + role.getYearsExperience());
        role.evaluateResume();
    }
}
