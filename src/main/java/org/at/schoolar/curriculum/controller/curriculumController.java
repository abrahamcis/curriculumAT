package org.at.schoolar.curriculum.controller;


import org.at.schoolar.curriculum.model.Curriculum;
import org.at.schoolar.curriculum.model.Error;
import org.at.schoolar.curriculum.model.ErrorDetails;
import org.at.schoolar.curriculum.model.Response;
import org.at.schoolar.curriculum.service.Imp.CurriculumServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController
public class curriculumController {
    @Autowired
    private CurriculumServiceImp curriculumServiceImp;

    @PostMapping("/person")
    public ResponseEntity<Response> addCurriculum(@Valid @RequestBody Curriculum curriculum){
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

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Error handleValidationExceptions( MethodArgumentNotValidException ex){
        List<ErrorDetails> errorDetails = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            errorDetails.add(ErrorDetails.builder()
                    .field(((FieldError) error).getField())
                    .errorMessage(error.getDefaultMessage())
                    .build());
        });
        return Error.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .statusMessage(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .errorDetails(errorDetails)
                .build();
    }
}
