package com.codesurmay.WorkNest.controller;

import com.codesurmay.WorkNest.model.JobPost;
import com.codesurmay.WorkNest.repository.JobPostRepo;
import com.codesurmay.WorkNest.service.JobPostImpl;
import com.mongodb.client.AggregateIterable;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jobs")
public class WorkNestController {

    @Autowired
    private JobPostRepo jobPostRepo;

    @Autowired
    JobPostImpl jobPostImpl;

    @PostMapping("/postjob/")

    public JobPost createJobPost(@RequestBody JobPost jobPost)
    {

        return  jobPostRepo.save(jobPost);
    }


    @GetMapping("getJAllobsListed")
    public List<JobPost> getAllJobs(){
        return  jobPostRepo.findAll();
    }

    public AggregateIterable<Document> getListByAscByExpLevel(@PathVariable String value){


        return jobPostImpl.getPostsByText( value);
    }

}
