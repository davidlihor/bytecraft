package com.bytecraft.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytecraft.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
