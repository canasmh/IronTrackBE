package com.IronTrack.IronTrackBE.Models;

import com.IronTrack.IronTrackBE.Entities.ExerciseEntitiy;
import com.IronTrack.IronTrackBE.Entities.RoutineExercisesEntity;
import lombok.Data;

@Data
public class Exercise {

    private String name;
    private Integer weight;
    private Integer sets;
    private Integer quantity;
    private String unit;

    public Exercise(ExerciseEntitiy entity, RoutineExercisesEntity rtEntity) {
        name = entity.getName();
        weight = rtEntity.getWeight();
        sets = rtEntity.getSets();
        quantity = rtEntity.getReps();
        unit = entity.getType();


    }
}
