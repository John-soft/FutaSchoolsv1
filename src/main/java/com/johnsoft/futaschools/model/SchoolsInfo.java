package com.johnsoft.futaschools.model;

public class SchoolsInfo {
    private String schoolName, schoolDepts;
    private int schoolImage;

    public SchoolsInfo(String schoolName, String schoolDepts, int schoolImage) {
        this.schoolName = schoolName;
        this.schoolDepts = schoolDepts;
        this.schoolImage = schoolImage;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolDepts() {
        return schoolDepts;
    }

    public void setSchoolDepts(String schoolDepts) {
        this.schoolDepts = schoolDepts;
    }

    public int getSchoolImage() {
        return schoolImage;
    }

    public void setSchoolImage(int schoolImage) {
        this.schoolImage = schoolImage;
    }
}
