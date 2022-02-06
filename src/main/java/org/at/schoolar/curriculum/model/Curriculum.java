package org.at.schoolar.curriculum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.at.schoolar.curriculum.constants.ErrorCodes;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "Curriculum")
public class Curriculum {
    @Id
    private String resourceId;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    private String firstName;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    private String lastName;

    private String job;

    private String city;

    private String country;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    private String email;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    private String phoneNumber;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    private List<Skill> skills;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    private List<Skill> languages;

    private List<WorkExperience> workexperience;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    private List<Education> education;

    private SocialMedia socialMedia;

    private List<Challenge> challenges;
    private Config config;
}
