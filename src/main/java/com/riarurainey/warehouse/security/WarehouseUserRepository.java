package com.riarurainey.warehouse.security;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface WarehouseUserRepository extends JpaRepository<WarehouseUser, Long> {

    Optional<WarehouseUser> findByEmail(String email);
}