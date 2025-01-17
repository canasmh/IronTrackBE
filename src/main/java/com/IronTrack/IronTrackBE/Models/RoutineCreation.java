package com.IronTrack.IronTrackBE.Models;

import com.IronTrack.IronTrackBE.Models.Exercise;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoutineCreation {
    private Integer userId;
    private String name;
    private List<Exercise> exercises;
    //{"name":"new","exercises":[{"name":"T-Bar Row with Handle","weight":"100","sets":"10","quantity":"10","quantityUnit":"rep"}]}
}
