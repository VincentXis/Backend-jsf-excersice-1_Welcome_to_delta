package pagebeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class WhatIsMyName {
    private String inputField;

    public void setInputField(String inputfield) {
        this.inputField = inputfield;
    }

    public String getInputField() {
        return inputField;
    }
}
