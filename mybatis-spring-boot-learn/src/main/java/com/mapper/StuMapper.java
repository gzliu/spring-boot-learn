package com.mapper;

import com.pojo.CityPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * Created by Administrator on 2017/3/20.
 */
@Mapper
public interface StuMapper {

//    @Select("select * from stu where stu_id=#{stu_id}")
    CityPojo findById( String id);

//    @Insert("insert into stu (stu_id,stu_name,stu_course,stu_tearch) values (#{stu_id},#{stu_name},#{stu_course},#{stu_tearch})")
    void insertPojo(@Param("stu_id") int id,@Param("stu_name") String name,@Param("stu_course") int course,@Param("stu_tearch") int tearch);

//    @Select("select * from stu")
    List<CityPojo> findAll();
}
