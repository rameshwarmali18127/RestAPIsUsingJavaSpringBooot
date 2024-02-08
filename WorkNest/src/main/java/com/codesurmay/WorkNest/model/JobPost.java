package com.codesurmay.WorkNest.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Arrays;


@Document(collection="code_surmay")
public class JobPost {
    @Id
    private String profile;
    private int exp;
    private String description;
    private String[] techStack;

    public JobPost() {
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTechStack(String[] techStack) {
        this.techStack = techStack;
    }



    @Override
    public String toString() {
        return "JobPost{" +
                "profile='" + profile + '\'' +
                ", exp=" + exp +
                ", description='" + description + '\'' +
                ", techStack=" + Arrays.toString(techStack) +
                '}';
    }

    public JobPost(String profile, int exp, String description, String[] techStack) {
        this.profile = profile;
        this.exp = exp;
        this.description = description;
        this.techStack = techStack;
    }



    public String getProfile() {
        return profile;
    }

    public int getExp() {
        return exp;
    }

    public String getDescription() {
        return description;
    }

    public String[] getTechStack() {
        return techStack;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public JobPost(String profile) {
        this.profile = profile;
    }

}
