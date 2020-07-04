package org.java.hotel.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum  HotelEnums {

    ROOM_LIST_NOT_FOUND(404,"客房列表不存在");
    //枚举中的字段
    private int code;//错误状态码
    private String msg;//错误信息
}
