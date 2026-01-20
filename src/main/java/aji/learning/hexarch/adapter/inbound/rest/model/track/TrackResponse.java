package aji.learning.hexarch.adapter.inbound.rest.model.track;

import jakarta.validation.constraints.NotNull;

public record TrackResponse(
        Boolean isBooked,
        String message
) {}
