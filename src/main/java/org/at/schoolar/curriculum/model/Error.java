package org.at.schoolar.curriculum.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Builder
@Data
@AllArgsConstructor
public class Error {
    private Integer statusCode;
    private String statusMessage;
    private List<ErrorDetails> errorDetails;
}
