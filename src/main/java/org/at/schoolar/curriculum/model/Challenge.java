package org.at.schoolar.curriculum.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Challenge {
    private String name;
    private String date;
    private String description;
    private String url;

}
