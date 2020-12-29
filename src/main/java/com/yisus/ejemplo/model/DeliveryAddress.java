package com.yisus.ejemplo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeliveryAddress {
    private String streetAddress;
    private String locality;
    private String region;
    private String state;
    private String country;
}
