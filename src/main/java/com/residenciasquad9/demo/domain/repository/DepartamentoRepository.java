package com.residenciasquad9.demo.domain.repository;

import com.residenciasquad9.demo.domain.entites.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
    Optional<Departamento> findByNome(String nome);
}
