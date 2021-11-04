package com.rogue.cockroachdbupsert.repositories;

import com.rogue.cockroachdbupsert.models.User;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends ExtendedJpaRepository<User, UUID> {

}
