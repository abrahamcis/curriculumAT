package org.at.schoolar.curriculum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.at.schoolar.curriculum.constants.ErrorCodes;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class Education {

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    private String name;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    private String career;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    private String from;

    private String to;

    private String forever;

    @NotNull(message = ErrorCodes.MANDATORY_FIELD)
    @NotEmpty(message = ErrorCodes.EMPTY_FIELD)
    @NotBlank(message = ErrorCodes.BLANK_FIELD)
    private String degree;
}
