package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pojo.Warehouse;
import service.WarehouseService;

import java.util.List;

@RestController
@RequestMapping("/warehouses")
@RequiredArgsConstructor
public class WarehouseController {
    private final WarehouseService warehouseService;

    @GetMapping("/remaining")
    public ResponseEntity<List<Warehouse>> getRemainingCapacity() {
        return ResponseEntity.ok(warehouseService.listWarehousesWithRemaining());
    }

    @PostMapping("/{code}/adjust")
    public ResponseEntity<Void> adjustCapacity(
            @PathVariable String code,
            @RequestParam int usedCapacity) {
        warehouseService.adjustCapacity(code, usedCapacity);
        return ResponseEntity.ok().build();
    }
}

