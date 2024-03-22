package ru.kelleemb.pet_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kelleemb.pet_project.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
