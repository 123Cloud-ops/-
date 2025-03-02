package service.serviceImpl;

import lombok.RequiredArgsConstructor;
import mapper.WarehouseMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.Warehouse;
import service.WarehouseService;

import java.util.List;

// 实现类 ‌:ml-citation{ref="3,4" data="citationList"}
@Service
@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService {
    private final WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> listWarehousesWithRemaining() {
        return warehouseMapper.selectWithRemaining();
    }

    @Override
    @Transactional
    public void adjustCapacity(String code, int newUsedCapacity) {
        warehouseMapper.updateUsedCapacity(code, newUsedCapacity);
    }
}
