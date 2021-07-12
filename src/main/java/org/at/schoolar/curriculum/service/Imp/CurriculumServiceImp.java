package org.at.schoolar.curriculum.service.Imp;

import org.at.schoolar.curriculum.model.Curriculum;
import org.at.schoolar.curriculum.service.CurriculumService;
import org.springframework.stereotype.Service;

@Service
public class CurriculumServiceImp implements CurriculumService {

    @Override
    public Curriculum addCurriculum(Curriculum curriculum) {
        return curriculum;
    }
}
