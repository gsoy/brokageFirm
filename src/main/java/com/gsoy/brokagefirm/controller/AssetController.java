package com.gsoy.brokagefirm.controller;

import com.gsoy.brokagefirm.model.Asset;
import com.gsoy.brokagefirm.model.request.AssetRequest;
import com.gsoy.brokagefirm.services.AssetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/assets")
@RequiredArgsConstructor
public class AssetController {

    private final AssetService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody AssetRequest request) {
        service.save(request);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/deposit")
    public ResponseEntity<?> addMoney(@RequestBody AssetRequest request) {
        service.save(request);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/withdraw")
    public ResponseEntity<?> deleteMoney(@RequestBody AssetRequest request) {
        service.save(request);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<Asset>> findAllAssets() {
        return ResponseEntity.ok(service.findAll());
    }
}
