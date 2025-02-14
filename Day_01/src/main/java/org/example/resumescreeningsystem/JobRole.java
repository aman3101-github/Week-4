package org.example.resumescreeningsystem;

// Abstract class
public abstract class JobRole {
    private String candidateName;
    private String jobRole;
    private int yearsExperience;

    // Constructor
    public JobRole(String candidateName, String jobRole, int yearsExperience) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
        this.yearsExperience = yearsExperience;
    }

    // Getters
    public String getCandidateName() {
        return candidateName;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public String getJobRole() {
        return jobRole;
    }

    // Abstract method to evaluate resume
    public abstract void evaluateResume();
}
