package com.yisus.ejemplo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeliveryDetail {
    private DeliveryAddress address;
    private String estimatedDate;
}
