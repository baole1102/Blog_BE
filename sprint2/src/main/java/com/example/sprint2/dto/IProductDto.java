package com.example.sprint2.dto;

import java.util.Date;

public interface IProductDto {
    Long getId();
    String getNameProduct();
    String getImageProduct();
    Long getPrice();
    String getContent();
    String getDescription();
    Integer getQuantity();
    Long getTypeProductId();
    Boolean getBoolean();

}
