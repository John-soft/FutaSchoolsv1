package com.johnsoft.futaschools.model;

public class DeptRequirementModel {
    String aboutDepartment, admissionRequirements, programDuration, gradRequirements, hodProfile;

    public DeptRequirementModel(String aboutDepartment, String admissionRequirements, String programDuration, String gradRequirements, String hodProfile) {
        this.aboutDepartment = aboutDepartment;
        this.admissionRequirements = admissionRequirements;
        this.programDuration = programDuration;
        this.gradRequirements = gradRequirements;
        this.hodProfile = hodProfile;
    }

    public String getAboutDepartment() {
        return aboutDepartment;
    }

    public void setAboutDepartment(String aboutDepartment) {
        this.aboutDepartment = aboutDepartment;
    }

    public String getAdmissionRequirements() {
        return admissionRequirements;
    }

    public void setAdmissionRequirements(String admissionRequirements) {
        this.admissionRequirements = admissionRequirements;
    }

    public String getProgramDuration() {
        return programDuration;
    }

    public void setProgramDuration(String programDuration) {
        this.programDuration = programDuration;
    }

    public String getGradRequirements() {
        return gradRequirements;
    }

    public void setGradRequirements(String gradRequirements) {
        this.gradRequirements = gradRequirements;
    }

    public String getHodProfile() {
        return hodProfile;
    }

    public void setHodProfile(String hodProfile) {
        this.hodProfile = hodProfile;
    }
}
