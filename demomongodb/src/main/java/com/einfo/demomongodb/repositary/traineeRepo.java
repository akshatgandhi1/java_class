package com.einfo.demomongodb.repositary;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.einfo.demomongodb.model.Trainee;


@Repository
public interface traineeRepo extends MongoRepository<Trainee, Integer> {
@Aggregation(pipeline = {"{'$match':{'location' : 'LA'}}"})
List<Trainee> getdata();
}
