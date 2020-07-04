package org.java.hotel.item.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.java.hotel.item.mapper.RoomMapper;
import org.java.hotel.item.pojo.Room;
import org.java.hotel.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomMapper roomMapper;

    /**
     * 分页查询
     * @return
     */
    public PageResult<Room> loadRoom(Integer page,Integer limit){

        //设置pageHelper
        PageHelper.startPage(page,limit);
        //执行分页查询
        PageInfo<Room> pageInfo = new PageInfo<>(roomMapper.selectAll());
        //将查询到的结果，封装成PageResult对象
        PageResult<Room> pageResult = new PageResult<>();
        pageResult.setCode(0);//请求正常
        pageResult.setCount(pageInfo.getTotal());//数据表中的数据总数
        pageResult.setData(pageInfo.getList());//品牌的集合

        return pageResult;
    }
}
