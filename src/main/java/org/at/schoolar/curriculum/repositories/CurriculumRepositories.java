package org.at.schoolar.curriculum.repositories;

import org.at.schoolar.curriculum.model.Curriculum;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CurriculumRepositories extends MongoRepository<Curriculum, String> {


}
