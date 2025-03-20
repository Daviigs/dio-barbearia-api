package com.dev.davi.dio_barbearia_api.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.time.OffsetDateTime;

public record ProblemResponse(@JsonProperty("status")
                              Integer status,
                              @JsonProperty("timestamp")
                              OffsetDateTime timestamp,
                              @JsonProperty("message")
                              String message) {

    @Builder(toBuilder = true)
    public ProblemResponse{}

}
