package org.at.schoolar.curriculum.service.Imp;

import org.at.schoolar.curriculum.model.Curriculum;
import org.at.schoolar.curriculum.model.Response;
import org.at.schoolar.curriculum.repositories.CurriculumRepositories;
import org.at.schoolar.curriculum.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CurriculumServiceImp implements CurriculumService {

    @Autowired
    CurriculumRepositories curriculumRepositories;

    CurriculumServiceImp(CurriculumRepositories curriculumRepositories){
        this.curriculumRepositories = curriculumRepositories;
    }

    @Override
    public ResponseEntity<Response> addCurriculum(Curriculum curriculum) {
        curriculum.setResourceId(UUID.randomUUID().toString());
        return new ResponseEntity<>(Response.builder().resourceId(curriculumRepositories.save(curriculum).getResourceId()).build(), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Curriculum> getCurriculum(String resourceId){
        if(curriculumRepositories.findById(resourceId).isPresent()) {
            return new ResponseEntity<>(curriculumRepositories.findById(resourceId).get(), HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<HttpHeaders> deleteCurriculum(String resourceId) {
        if(curriculumRepositories.findById(resourceId).isPresent()) {
            curriculumRepositories.deleteById(resourceId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Curriculum> updateCurriculum(String resourceId, Curriculum curriculum) {
        if(curriculumRepositories.findById(resourceId).isPresent()) {
            curriculum.setResourceId(resourceId);
            return new ResponseEntity<>(curriculumRepositories.save(curriculum), HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
