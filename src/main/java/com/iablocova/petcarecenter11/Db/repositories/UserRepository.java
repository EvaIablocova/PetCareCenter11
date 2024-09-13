package com.iablocova.petcarecenter11.Db.repositories;

import com.iablocova.petcarecenter11.Db.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
