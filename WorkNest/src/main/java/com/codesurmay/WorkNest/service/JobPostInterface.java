package com.codesurmay.WorkNest.service;

import com.mongodb.client.AggregateIterable;
import org.bson.Document;

public interface JobPostInterface {

    public AggregateIterable<Document> getPostsByText(String text);
}
