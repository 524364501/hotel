package org.java.hotel.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {

    private Integer code;//状态码
    private String msg;//消息
    private Long count;//数据总数
    private List<T> data;//用于保存查询到的结果
}
