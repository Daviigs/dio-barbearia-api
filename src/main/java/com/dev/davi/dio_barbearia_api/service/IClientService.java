package com.dev.davi.dio_barbearia_api.service;

import com.dev.davi.dio_barbearia_api.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}
