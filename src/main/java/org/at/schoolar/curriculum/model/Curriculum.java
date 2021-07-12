package org.at.schoolar.curriculum.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Curriculum {
    private String firstName;
    private String lastName;
    private String job;
    private String city;
    private String country;
    private String email;
    private String phoneNumber;
    private List<Skill> skills;
    private List<Skill> languages;
    private List<WorkExperience> workexperience;
    private List<Education> education;
    private SocialMedia socialMedia;
    private List<Challenge> challenges;
    private Config config;
}
