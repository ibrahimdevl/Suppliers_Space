package com.ibrahimdev.suppliers_space.repositories;

import java.util.Optional;

import com.ibrahimdev.suppliers_space.models.ERole;
import com.ibrahimdev.suppliers_space.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

