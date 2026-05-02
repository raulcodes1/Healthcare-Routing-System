package com.healthcare.domain;

public class patient {
    public String id;
    public String location;
    public int urgencyLevel;

    public patient(String id, String location, int urgencyLevel) {
        this.id = id;
        this.location = location;
        this.urgencyLevel = urgencyLevel;
    }
}