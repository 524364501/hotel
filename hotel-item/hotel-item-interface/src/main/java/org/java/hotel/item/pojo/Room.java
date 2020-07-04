package org.java.hotel.item.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "hotel_room")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room implements Serializable {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private Integer tId;
    private Integer nId;
    private String floor;
    private Integer status;
    private String description;
    private Integer fPrice;

}
