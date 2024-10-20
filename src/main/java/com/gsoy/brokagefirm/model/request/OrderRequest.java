package com.gsoy.brokagefirm.model.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Getter
@Setter
@Builder
public class OrderRequest {

    private Integer customerId;
    private String assetName;
    private String orderSide;
    private Integer size;
    private BigDecimal price;

}
