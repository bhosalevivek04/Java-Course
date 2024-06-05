//package com.vivek.JobApp.model;
//
//import java.util.List;
//
//import org.springframework.stereotype.Component;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Component
//public class JobPost {
//
//	private String postProfile;
//	private String postId;
//	private String postDesc;
//	private int reqExperience;
//	private List<String> postTechStack;
//
//}
package com.vivek.JobApp.model;

import java.util.List;

public class JobPost {
    private String postProfile;
    private String postId;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

    // Constructor
    public JobPost(String postProfile, String postId, String postDesc, int reqExperience, List<String> postTechStack) {
        this.postProfile = postProfile;
        this.postId = postId;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

    // Default constructor
    public JobPost() {}

    // Getter and Setter for postProfile
    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    // Getter and Setter for postId
    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    // Getter and Setter for postDesc
    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    // Getter and Setter for reqExperience
    public int getReqExperience() {
        return reqExperience;
    }

    public void setReqExperience(int reqExperience) {
        this.reqExperience = reqExperience;
    }

    // Getter and Setter for postTechStack
    public List<String> getPostTechStack() {
        return postTechStack;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }
}
