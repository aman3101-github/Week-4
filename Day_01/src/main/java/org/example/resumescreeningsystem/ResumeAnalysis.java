package org.example.resumescreeningsystem;

import java.util.List;

public class ResumeAnalysis {
    // Wildcard method to process multiple resumes dynamically
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("\n Processing Resume for: " + resume.getJobRole());
            resume.evaluateResume();
        }
    }
}
