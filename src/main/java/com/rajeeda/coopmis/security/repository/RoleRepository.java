package com.rajeeda.coopmis.security.repository;


import com.rajeeda.coopmis.security.model.Role;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
@Primary
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role);

}