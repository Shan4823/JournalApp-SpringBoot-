  package com.shan.journalApp.repository;

import com.shan.journalApp.entity.JournalEntry;
import com.shan.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String userName);
}
