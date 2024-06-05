package com.vivek.SpringBootREST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.SpringBootREST.model.JobPost;
import com.vivek.SpringBootREST.service.JobService;

@RestController
@CrossOrigin(origins ="http://localhost:3000" )
public class JobRESTController {
	@Autowired
	private JobService service;
	
	@GetMapping("jobPosts")
	@ResponseBody
	public List<JobPost> returnAllJobPosts() {
		return service.returnAllJobPosts();
	}
	@GetMapping("jobPost/{postId}")
	public JobPost getJob(@PathVariable("postId") int postId) {
		return service.getJob(postId);
	}
	@PostMapping("jobPost")
	public JobPost addJob(@RequestBody JobPost jobPost) {
		service.addJobPost(jobPost);
		return service.getJob(Integer.parseInt(jobPost.getPostId()));
	}
	@PutMapping("jobPost")
	public JobPost updateJob(@RequestBody JobPost jobPost) {
		service.updateJob(jobPost);
		return service.getJob(Integer.parseInt(jobPost.getPostId()));
	}
	@DeleteMapping("jobPost/{postId}")
	public String deleteJob(@PathVariable int postId) {
		service.deleteJob(postId);
		return "Deleted";
	}
}
