package org.java.hotel.handle;

import org.java.hotel.enums.HotelEnums;
import org.java.hotel.exception.HotelException;
import org.java.hotel.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(HotelException.class)
    public ResponseEntity<ExceptionResult> handelException(HotelException ex){
        //获得自定义异常的中枚举ShoppingEnums，枚举中，包含两个值，状态码和错误消息
        HotelEnums en = ex.getHotelEnums();
        //创建对象，封装返回结果
        ExceptionResult result = new ExceptionResult(en);
        return ResponseEntity.status(en.getCode()).body(result);
    }
}
