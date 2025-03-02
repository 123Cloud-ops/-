package service;

import pojo.Warehouse;

import java.util.List;

// 接口定义 ‌:ml-citation{ref="3,4" data="citationList"}
public interface WarehouseService {
    List<Warehouse> listWarehousesWithRemaining();
    void adjustCapacity(String code, int newUsedCapacity);
}
