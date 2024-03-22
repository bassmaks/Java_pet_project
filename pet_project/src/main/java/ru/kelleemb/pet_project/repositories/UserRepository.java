package ru.kelleemb.pet_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kelleemb.pet_project.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
