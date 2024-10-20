package com.gsoy.brokagefirm.model.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AssetRequest {

    private String assetName;
    private Integer size;
    private Integer usableSize;

}
