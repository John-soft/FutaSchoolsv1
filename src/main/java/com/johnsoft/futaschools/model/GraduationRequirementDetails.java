package com.johnsoft.futaschools.model;

public class GraduationRequirementDetails {
    String titleText;
    String gradRequirementText;
    private boolean expanded;

    public GraduationRequirementDetails(String titleText, String gradRequirementText) {
        this.titleText = titleText;
        this.gradRequirementText = gradRequirementText;
        this.expanded = false;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getGradRequirementText() {
        return gradRequirementText;
    }

    public void setGradRequirementText(String gradRequirementText) {
        this.gradRequirementText = gradRequirementText;
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
                ", gradRequirementText='" + gradRequirementText +
                '}';
    }
}
