package com.johnsoft.futaschools.model;

public class FrequentQuestionDetails {
    private String title;
    private String faqQuestion;
    private boolean expanded;

    public FrequentQuestionDetails(String title, String faqQuestion) {
        this.title = title;
        this.faqQuestion = faqQuestion;
        this.expanded = false;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFaqQuestion() {
        return faqQuestion;
    }

    public void setFaqQuestion(String faqQuestion) {
        this.faqQuestion = faqQuestion;
    }

    @Override
    public String toString() {
        return "FrequentQuestionDetails{" +
                "title='" + title + '\'' +
                ", faqQuestion='" + faqQuestion + '\'' +
                '}';
    }
}
