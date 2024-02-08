package com.codesurmay.WorkNest.repository;

import com.codesurmay.WorkNest.model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobPostRepo  extends MongoRepository<JobPost,String> {
}
