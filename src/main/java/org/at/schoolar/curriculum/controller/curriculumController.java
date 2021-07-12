package org.at.schoolar.curriculum.controller;


import org.at.schoolar.curriculum.model.Curriculum;
import org.at.schoolar.curriculum.model.Response;
import org.at.schoolar.curriculum.model.ResponseAccepted;
import org.at.schoolar.curriculum.service.Imp.CurriculumServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class curriculumController {
    @Autowired
    private CurriculumServiceImp curriculumServiceImp;

    @PostMapping("/person")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Response> addCurriculum(@RequestBody Curriculum curriculum){
        return curriculumServiceImp.addCurriculum(curriculum);

    }
}
