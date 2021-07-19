package org.at.schoolar.curriculum.controller;


import org.at.schoolar.curriculum.model.Curriculum;
import org.at.schoolar.curriculum.model.Response;
import org.at.schoolar.curriculum.service.Imp.CurriculumServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class curriculumController {
    @Autowired
    private CurriculumServiceImp curriculumServiceImp;

    @PostMapping("/person")
    public ResponseEntity<Response> addCurriculum(@RequestBody Curriculum curriculum){
        return curriculumServiceImp.addCurriculum(curriculum);
    }

    @GetMapping("/person/{resourceId}")
    public ResponseEntity<Curriculum> getCurriculum(@PathVariable String resourceId){
        return curriculumServiceImp.getCurriculum(resourceId);
    }

    @DeleteMapping("/person/{resourceId}")
    public void deleteCurriculum(@PathVariable String resourceId){
        curriculumServiceImp.deleteCurriculum(resourceId);
    }

    @PutMapping("/person/{resourceId}")
    public ResponseEntity<Curriculum> updateCurriculum(@PathVariable String resourceId, @RequestBody Curriculum curriculum){
        return curriculumServiceImp.updateCurriculum(resourceId, curriculum);
    }
}
