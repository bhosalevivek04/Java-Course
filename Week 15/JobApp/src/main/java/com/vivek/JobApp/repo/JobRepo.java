package com.vivek.JobApp.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vivek.JobApp.model.JobPost;

@Repository
public class JobRepo {

    // ArrayList to store JobPost objects
    private List<JobPost> jobs = new ArrayList<>();

    // Constructor to initialize with some job posts
    public JobRepo() {
        jobs.add(new JobPost("Software Engineer", "12345", "Responsible for developing software applications.", 3, Arrays.asList("Java", "Spring", "Hibernate")));
        jobs.add(new JobPost("Data Analyst", "67890", "Analyze data and generate insights.", 2, Arrays.asList("Python", "SQL", "Tableau")));
    }

    // Method to return all JobPosts
    public List<JobPost> returnAllJobPosts() {
        return new ArrayList<>(jobs);
    }

    // Method to save a job post object into arrayList
    public void addJobPost(JobPost job) {
        jobs.add(job);
    }
}
