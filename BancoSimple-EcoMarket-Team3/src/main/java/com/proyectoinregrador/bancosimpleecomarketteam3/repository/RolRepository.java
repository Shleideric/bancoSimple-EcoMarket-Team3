package com.proyectoinregrador.bancosimpleecomarketteam3.repository;

import com.proyectoinregrador.bancosimpleecomarketteam3.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {

}
