package com.ryndrappf.create_jwt_auth.Repository;

import com.ryndrappf.create_jwt_auth.Entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String username);
}
