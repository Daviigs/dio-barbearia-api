package com.dev.davi.dio_barbearia_api.service;

import com.dev.davi.dio_barbearia_api.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}
