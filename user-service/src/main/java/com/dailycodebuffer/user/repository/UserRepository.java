package com.dailycodebuffer.user.repository;

import com.dailycodebuffer.user.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<People,Long> {
    People findByUserId(Long userId);
}
