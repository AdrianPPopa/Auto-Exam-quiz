package com.egrecomag.AutoExamquiz.repository;

import com.egrecomag.AutoExamquiz.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
