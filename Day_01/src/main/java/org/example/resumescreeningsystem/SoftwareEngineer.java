package org.example.resumescreeningsystem;

public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int yearsExperience) {
        super(candidateName, "Software Engineer", yearsExperience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("Checking ATS score for Software Engineer resume of " + getCandidateName());
    }
}
