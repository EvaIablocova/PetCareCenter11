package com.iablocova.petcarecenter11.repositories;

import com.iablocova.petcarecenter11.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
