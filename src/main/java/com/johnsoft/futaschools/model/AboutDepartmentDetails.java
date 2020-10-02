package com.johnsoft.futaschools.model;

public class AboutDepartmentDetails {

    String titleText;
    String welcomeText;
    String aboutText;
    private boolean expanded;

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public AboutDepartmentDetails(String titleText, String welcomeText, String aboutText) {
        this.titleText = titleText;
        this.welcomeText = welcomeText;
        this.aboutText = aboutText;
        this.expanded = false;
    }


    @Override
    public String toString() {
        return "AboutDetails{" +
                "titleText='" + titleText + '\'' +
                ", welcomeText='" + welcomeText + '\'' +
                ", aboutText='" + aboutText + '\'' +
                '}';
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }

    public String getAboutText() {
        return aboutText;
    }

    public void setAboutText(String aboutText) {
        this.aboutText = aboutText;
    }

}
