package com.codesurmay.WorkNest.controller;

import com.codesurmay.WorkNest.model.JobPost;
import com.codesurmay.WorkNest.repository.JobPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jobs")
public class WorkNestController {

    @Autowired
    private JobPostRepo jobPostRepo;

    @PostMapping("/postjob/")

    public JobPost createJobPost(@RequestBody JobPost jobPost)
    {
            return  jobPostRepo.save(jobPost);
    }


    @GetMapping("getJAllobsListed")
    public List<JobPost> getAllJobs(){
        return  jobPostRepo.findAll();
    }

}
