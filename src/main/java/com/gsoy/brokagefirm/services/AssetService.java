package com.gsoy.brokagefirm.services;

import com.gsoy.brokagefirm.model.Asset;
import com.gsoy.brokagefirm.model.request.AssetRequest;
import com.gsoy.brokagefirm.repository.AssetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssetService {

    private final AssetRepository repository;

    public void save(AssetRequest request) {
        var asset = Asset.builder()
                .assetName(request.getAssetName())
                .size(request.getSize())
                .usableSize(request.getUsableSize())
                .build();
        repository.save(asset);
    }

    public List<Asset> findAll() {
        return repository.findAll();
    }
}
