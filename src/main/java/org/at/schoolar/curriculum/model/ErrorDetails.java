package org.at.schoolar.curriculum.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorDetails {
    private String field;
    private String errorMessage;
}
