package org.java.hotel.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.java.hotel.enums.HotelEnums;

@Getter
@AllArgsConstructor
public class HotelException extends RuntimeException {

    private HotelEnums hotelEnums;
}
