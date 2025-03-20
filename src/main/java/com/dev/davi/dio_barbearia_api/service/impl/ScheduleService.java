package com.dev.davi.dio_barbearia_api.service.impl;

import com.dev.davi.dio_barbearia_api.entity.ScheduleEntity;
import com.dev.davi.dio_barbearia_api.repository.IScheduleRepository;
import com.dev.davi.dio_barbearia_api.service.IScheduleService;
import com.dev.davi.dio_barbearia_api.service.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());

        return repository.save(entity);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}
