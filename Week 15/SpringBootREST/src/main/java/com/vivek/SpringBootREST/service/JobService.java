package com.vivek.SpringBootREST.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.SpringBootREST.model.JobPost;
import com.vivek.SpringBootREST.repo.JobRepo;

@Service
public class JobService {
	@Autowired
	public JobRepo repo;

	// method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return repo.returnAllJobPosts();

	}

	// ***************************************************************************

	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		repo.addJobPost(jobPost);

	}

	public JobPost getJob(int postId) {
		return repo.getJob(postId);
	}

	public void updateJob(JobPost jobPost) {
		repo.updateJob(jobPost);
	}

	public void deleteJob(int postId) {
		repo.deleteJob(postId);
	}

}
