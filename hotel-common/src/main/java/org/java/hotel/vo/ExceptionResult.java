package org.java.hotel.vo;

import lombok.Data;
import org.java.hotel.enums.HotelEnums;

/**
 * 用于在出错后，封装要返回的数据
 */
@Data
public class ExceptionResult {

    private int code;//错误状态码
    private String msg;//异常消息内容
    private Long timeStamp;//时间戳

    /**
     * 编写一个带参数的构造方法，参数是一个枚举
     * @param hotelEnums
     */
    public ExceptionResult(HotelEnums hotelEnums){
        this.code = hotelEnums.getCode();
        this.msg = hotelEnums.getMsg();
        this.timeStamp = System.currentTimeMillis();
    }
}
