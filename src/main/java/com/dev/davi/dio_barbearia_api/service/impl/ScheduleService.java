package com.dev.davi.dio_barbearia_api.service.impl;

import com.dev.davi.dio_barbearia_api.entity.ScheduleEntity;
import com.dev.davi.dio_barbearia_api.repository.IScheduleRepository;
import com.dev.davi.dio_barbearia_api.service.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleQueryService{

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity findById(long id) {
        return null;
    }

    @Override
    public List<ScheduleEntity> findInMonth(OffsetDateTime startAt, OffsetDateTime endAt) {
        return List.of();
    }

    @Override
    public void verifyIfScheduleExists(OffsetDateTime startAt, OffsetDateTime endAt) {

    }
}
