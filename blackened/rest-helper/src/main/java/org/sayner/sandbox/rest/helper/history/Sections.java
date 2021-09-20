package org.sayner.sandbox.rest.helper.history;

public class Sections {
    private boolean isChanged;

    private String sectionTitle;

    public Sections() {
    }

    public Sections(boolean isChanged, String sectionTitle) {
        this.isChanged = isChanged;
        this.sectionTitle = sectionTitle;
    }

    public void setIsChanged(boolean isChanged){
        this.isChanged = isChanged;
    }
    public boolean getIsChanged(){
        return this.isChanged;
    }
    public void setSectionTitle(String sectionTitle){
        this.sectionTitle = sectionTitle;
    }
    public String getSectionTitle(){
        return this.sectionTitle;
    }
}
