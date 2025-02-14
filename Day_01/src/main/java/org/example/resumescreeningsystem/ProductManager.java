package org.example.resumescreeningsystem;

public class ProductManager extends JobRole {
    public ProductManager(String candidateName, int yearsExperience) {
        super(candidateName, "Product Manager", yearsExperience);
    }

    @Override
    public void evaluateResume() {
        System.out.println("Checking ATS score for Product Manager resume of " + getCandidateName());
    }
}
