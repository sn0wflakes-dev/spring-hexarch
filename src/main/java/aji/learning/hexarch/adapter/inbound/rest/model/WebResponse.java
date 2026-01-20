package aji.learning.hexarch.adapter.inbound.rest.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WebResponse<T> {
    private T data;
}
