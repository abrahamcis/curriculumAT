package org.at.schoolar.curriculum.repositories;

import org.at.schoolar.curriculum.model.Curriculum;

import java.util.UUID;

public interface CurriculumRepositories {

    public Curriculum saveCurriculum(Curriculum curriculum);

    public Curriculum findCurriculum(UUID resourceId);

    public Curriculum updateCurriculum(Curriculum curriculum);
}
