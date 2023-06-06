package com.example.dao;


import com.example.entity.UserDate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MainMapper {
    @Select("select * from student where sname=#{sname}")
    UserDate findUsername(String sname) ;

}
