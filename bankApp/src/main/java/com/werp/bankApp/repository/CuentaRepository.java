package com.werp.bankApp.repository;

import com.werp.bankApp.entity.Cliente;
import com.werp.bankApp.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

    Optional<Cuenta> findByNumeroCuenta(String numeroCuenta);

    List<Cuenta> findByClienteId(Long cliente);
}
