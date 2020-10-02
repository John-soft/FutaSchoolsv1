package com.johnsoft.futaschools.model;

public class ProgramDurationDetails {
    String titleText;
    String programDurationText;
    private boolean expanded;

    public ProgramDurationDetails(String titleText, String programDurationText) {
        this.titleText = titleText;
        this.programDurationText = programDurationText;
        this.expanded = false;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getProgramDurationText() {
        return programDurationText;
    }

    public void setProgramDurationText(String programDurationText) {
        this.programDurationText = programDurationText;
    }

    public boolean isExpanded() {
        return expanded;

    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "ProgramDurationText{" +
                "titleText='" + titleText + '\'' +
                ", programDurationText='" + programDurationText +
                '}';
    }
}
