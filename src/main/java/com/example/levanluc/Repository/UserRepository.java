package com.example.levanluc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.levanluc.*;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
