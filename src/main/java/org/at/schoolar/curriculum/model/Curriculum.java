package org.at.schoolar.curriculum.model;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(value = "First name of the candidate. Required parameter", required = true)
    private String firstName;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    @ApiModelProperty(value = "Last name of the candidate. Required parameter", required = true)
    private String lastName;

    @ApiModelProperty(value = "Current Job of the candidate")
    private String job;

    @ApiModelProperty(value = "Current city of the candidate")
    private String city;

    @ApiModelProperty(value = "Current country of the candidate")
    private String country;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    @ApiModelProperty(value = "Email address for contact. Required Information", required = true)
    private String email;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    @ApiModelProperty(value = "Phone number for contact. Required information", required = true)
    private String phoneNumber;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @ApiModelProperty(value = "Skills of the candidate. Required field", required = true)
    private List<Skill> skills;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @ApiModelProperty(value = "Languages of the candidate. Required field", required = true)
    private List<Skill> languages;

    @ApiModelProperty(value = "Working experience of the candidate. Required Field", required = true)
    private List<WorkExperience> workexperience;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @ApiModelProperty(value = "Education of the candidate. Required Field", required = true)
    private List<Education> education;

    @ApiModelProperty(value = "Social media information of the candidate")
    private SocialMedia socialMedia;

    @ApiModelProperty(value = "Challenges resolved by the candidate")
    private List<Challenge> challenges;

    @ApiModelProperty(value = "Configuration for the curriculum UI")
    private Config config;
}
