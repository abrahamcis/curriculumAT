package org.at.schoolar.curriculum.service;

import org.at.schoolar.curriculum.model.Curriculum;
import org.at.schoolar.curriculum.model.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

public interface CurriculumService {
    ResponseEntity<Response> addCurriculum(Curriculum curriculum);

    ResponseEntity<Curriculum> getCurriculum(String resourceId);

    ResponseEntity<HttpHeaders> deleteCurriculum(String resourceId);

    ResponseEntity<Curriculum> updateCurriculum(String resourceId, Curriculum curriculum);
}
