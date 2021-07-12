package org.at.schoolar.curriculum.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WorkExperience {
    private String title;
    private String company;
    private String from;
    private String to;
    private String current;
    private String description;
}
