package com.dev.taoxanh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.taoxanh.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String name);
}
