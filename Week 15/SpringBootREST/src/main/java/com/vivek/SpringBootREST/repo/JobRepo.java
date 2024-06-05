package com.vivek.SpringBootREST.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vivek.SpringBootREST.model.JobPost;

@Repository
public class JobRepo {

    // ArrayList to store JobPost objects
    private List<JobPost> jobs = new ArrayList<>();

    // Constructor to initialize with some job posts
    public JobRepo() {
        jobs.add(new JobPost("Software Engineer", "3", "Responsible for developing software applications.", 3, Arrays.asList("Java", "Spring", "Hibernate")));
        jobs.add(new JobPost("Data Analyst", "4", "Analyze data and generate insights.", 2, Arrays.asList("Python", "SQL", "Tableau")));
    }

    // Method to return all JobPosts
    public List<JobPost> returnAllJobPosts() {
        return new ArrayList<>(jobs);
    }

    // Method to save a job post object into arrayList
    public void addJobPost(JobPost job) {
        jobs.add(job);
    }

    // Method to get a job post by postId
    public JobPost getJob(int postId) {
        for (JobPost job : jobs) {
            if (Integer.parseInt(job.getPostId()) == postId) {
                return job;
            }
        }
        return null;
    }

	public void updateJob(JobPost jobPost) {
		for(JobPost jobPost1 : jobs) {
			if(jobPost1.getPostId()==jobPost.getPostId()) {
				jobPost1.setPostProfile(jobPost.getPostProfile());
				jobPost1.setPostDesc(jobPost.getPostDesc());
				jobPost1.setReqExperience(jobPost.getReqExperience());
				jobPost1.setPostTechStack(jobPost.getPostTechStack());
			}
		}
	}

	public void deleteJob(int postId) {
		for(JobPost jobPost : jobs) {
			if(Integer.parseInt(jobPost.getPostId())== postId) {
				jobs.remove(jobPost);
			}
		}
		
	}
}
