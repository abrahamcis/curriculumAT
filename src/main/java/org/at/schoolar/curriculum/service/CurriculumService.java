package org.at.schoolar.curriculum.service;

import org.at.schoolar.curriculum.model.Curriculum;
import org.at.schoolar.curriculum.model.Response;
import org.springframework.http.ResponseEntity;

public interface CurriculumService {
    ResponseEntity<Response> addCurriculum(Curriculum curriculum);
}
