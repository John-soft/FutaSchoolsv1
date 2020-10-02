package com.johnsoft.futaschools.model;

public class DeptInfo {
    private String deptName;
    private int deptImage;

    public DeptInfo(String deptName, int deptImage) {
        this.deptName = deptName;
        this.deptImage = deptImage;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptImage() {
        return deptImage;
    }

    public void setDeptImage(int deptImage) {
        this.deptImage = deptImage;
    }
}
