package org.example.resumescreeningsystem;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating individual resumes
        SoftwareEngineer se = new SoftwareEngineer("Aman", 5);
        DataScientist ds = new DataScientist("Adarsh", 3);
        ProductManager pm = new ProductManager("Ankush", 2);

        // Processing a single resume using Generic Class
        Resume<SoftwareEngineer> seResume = new Resume<>(se);
        seResume.displayResume();

        // Creating a list of resumes for processing multiple resumes
        List<JobRole> resumeList = Arrays.asList(se, ds, pm);

        // Processing multiple resumes using wildcard method
        ResumeAnalysis.processResumes(resumeList);
    }
}
