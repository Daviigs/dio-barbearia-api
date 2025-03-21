package com.dev.davi.dio_barbearia_api.repository;

import com.dev.davi.dio_barbearia_api.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClientRepository extends JpaRepository<com.dev.davi.dio_barbearia_api.entity.ClientEntity, Long> {

    boolean existsByEmail(final String email);

    boolean existsByPhone(final String phone);

    Optional<ClientEntity> findByEmail(final String email);

    Optional<ClientEntity> findByPhone(final String phone);

}