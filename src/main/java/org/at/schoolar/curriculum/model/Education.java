package org.at.schoolar.curriculum.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Education {
    private String name;
    private String career;
    private String from;
    private String to;
    private String forever;
    private String degree;
}
