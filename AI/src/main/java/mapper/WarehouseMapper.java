package mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pojo.Warehouse;

import java.util.List;

@Mapper
public interface WarehouseMapper {
    // 带剩余容量的查询
    @Select("SELECT *, (total_capacity - used_capacity) AS remaining FROM warehouse")
    List<Warehouse> selectWithRemaining();

    // 动态更新使用量
    @Update("UPDATE warehouse SET used_capacity = #{usedCapacity} WHERE code = #{code}")
    int updateUsedCapacity(@Param("code") String code, @Param("usedCapacity") int usedCapacity);
}

