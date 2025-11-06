package org.embarx.firstspringbootexample;

public class HelloResponce {
    private String message;

    public HelloResponce(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
