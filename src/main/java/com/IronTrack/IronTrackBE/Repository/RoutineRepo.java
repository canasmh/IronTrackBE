package com.IronTrack.IronTrackBE.Repository;

import com.IronTrack.IronTrackBE.Repository.Entities.RoutineEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoutineRepo extends JpaRepository<RoutineEntitiy, Integer> {
    Optional<RoutineEntitiy> findFirstByName(String name);

}