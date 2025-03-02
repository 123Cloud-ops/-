package pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {
    private Long id;
    private String code;  // 唯一编码 ‌:ml-citation{ref="7" data="citationList"}
    private String name;
    private Integer totalCapacity;
    private Integer usedCapacity;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}

