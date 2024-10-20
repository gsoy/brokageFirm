package com.gsoy.brokagefirm.repository;

import com.gsoy.brokagefirm.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Integer> {
}
