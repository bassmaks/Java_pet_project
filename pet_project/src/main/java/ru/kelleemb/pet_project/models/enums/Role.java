package ru.kelleemb.pet_project.models.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_ESER, ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
