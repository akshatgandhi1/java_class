package com.einfo.task.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.einfo.task.modle.movie_booking;

@Repository
public interface movieRepo extends MongoRepository<movie_booking, Integer> {

}
