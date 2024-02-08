package com.codesurmay.WorkNest.service;

import java.util.Arrays;

import com.mongodb.client.MongoClient;
import org.bson.Document;
//import com.mongodb.MongoClient;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.AggregateIterable;
import org.springframework.beans.factory.annotation.Autowired;

public class JobPostImpl implements JobPostInterface {



    @Autowired
    MongoClient mongoClient ;





    @Override
    public AggregateIterable<Document> getPostsByText(String text) {


        MongoDatabase database = mongoClient.getDatabase("CodeSurmay");
        MongoCollection<Document> collection = database.getCollection("code_surmay");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$sort",
                new Document("exp", 1L))));


        return result;
    }
}
