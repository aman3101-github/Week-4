package org.example.resumescreeningsystem;

public class DataScientist extends JobRole {
    public DataScientist(String candidateName, int yearsExperience) {
        super(candidateName, "Data Scientist", yearsExperience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("Checking ATS score for Data Scientist resume of " + getCandidateName());
    }
}
