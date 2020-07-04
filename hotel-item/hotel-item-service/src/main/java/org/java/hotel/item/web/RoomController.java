package org.java.hotel.item.web;

import org.java.hotel.item.pojo.Room;
import org.java.hotel.item.service.RoomService;
import org.java.hotel.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    /**
     * 分页查询
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity<PageResult<Room>> loadRoom(@RequestParam("page") Integer page,@RequestParam("limit") Integer limit){

        PageResult<Room> pageResult = roomService.loadRoom(page, limit);
        return ResponseEntity.ok(pageResult);
    }
}
