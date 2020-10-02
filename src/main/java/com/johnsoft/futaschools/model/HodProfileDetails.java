package com.johnsoft.futaschools.model;

public class HodProfileDetails {

    String titleText;
    String hodProfileText;
    private boolean expanded;

    public HodProfileDetails(String titleText, String hodProfileText) {
        this.titleText = titleText;
        this.hodProfileText = hodProfileText;
        this.expanded = false;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getHodProfileText() {
        return hodProfileText;
    }

    public void setHodProfileText(String hodProfileText) {
        this.hodProfileText = hodProfileText;
    }

    public boolean isExpanded() {
        return expanded;

    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "HodProfileDetails{" +
                "titleText='" + titleText + '\'' +
                ", hodProfileText='" + hodProfileText +
                '}';
    }
}
