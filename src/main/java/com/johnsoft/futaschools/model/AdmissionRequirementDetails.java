package com.johnsoft.futaschools.model;

public class AdmissionRequirementDetails {
    String titleText;
    String adminRequirementText;
    private boolean expanded;

    public AdmissionRequirementDetails(String titleText, String adminRequirementText) {
        this.titleText = titleText;
        this.adminRequirementText = adminRequirementText;
        this.expanded = false;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getAdminRequirementText() {
        return adminRequirementText;
    }

    public void setAdminRequirementText(String adminRequirementText) {
        this.adminRequirementText = adminRequirementText;
    }

    public boolean isExpanded() {
        return expanded;

    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "AdminRequirementDetails{" +
                "titleText='" + titleText + '\'' +
                ", adminRequirementText='" + adminRequirementText  +
                '}';
    }
}
