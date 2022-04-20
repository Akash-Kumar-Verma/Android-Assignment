package com.example.androidassignment;

import java.util.List;

public class data {

    private String name , id , profileImage;
    private List<String> qualification,subjects;

    public data(String name, String id, String profileImage, List<String> subjects, List<String> qualifications) {
        this.name = name;
        this.id = id;
        this.profileImage = profileImage;
        this.subjects = subjects;
        this.qualification = qualifications;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public List<String> getQualification() {
        return qualification;
    }
}
