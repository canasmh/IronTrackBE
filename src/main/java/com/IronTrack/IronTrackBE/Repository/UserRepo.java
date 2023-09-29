package com.IronTrack.IronTrackBE.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.IronTrack.IronTrackBE.Entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    // Define custom query methods if needed
    UserEntity findByEmail(String email);
}


