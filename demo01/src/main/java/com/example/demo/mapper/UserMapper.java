package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository()
@Mapper
public interface UserMapper {

    User Sel(int id);
    User Insert(User user);
}
