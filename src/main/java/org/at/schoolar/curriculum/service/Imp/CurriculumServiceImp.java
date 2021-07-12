package org.at.schoolar.curriculum.service.Imp;

import org.at.schoolar.curriculum.model.Curriculum;
import org.at.schoolar.curriculum.model.Response;
import org.at.schoolar.curriculum.service.CurriculumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CurriculumServiceImp implements CurriculumService {

    @Override
    public ResponseEntity<Response> addCurriculum(Curriculum curriculum) {
        return new ResponseEntity<>(Response.builder().resourceId(UUID.randomUUID()).build(), HttpStatus.CREATED);
    }
}
