package com.dev.davi.dio_barbearia_api.mapper;

import com.dev.davi.dio_barbearia_api.controller.request.SaveClientRequest;
import com.dev.davi.dio_barbearia_api.controller.request.UpdateClientRequest;
import com.dev.davi.dio_barbearia_api.controller.response.ClientDetailResponse;
import com.dev.davi.dio_barbearia_api.controller.response.ListClientResponse;
import com.dev.davi.dio_barbearia_api.controller.response.SaveClientResponse;
import com.dev.davi.dio_barbearia_api.controller.response.UpdateClientResponse;
import com.dev.davi.dio_barbearia_api.entity.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}
