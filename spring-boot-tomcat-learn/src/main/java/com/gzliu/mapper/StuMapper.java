package com.gzliu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gzliu.vo.StuVo;

/**   
 * @ClassName:  StuMapper   
 * @Description: mybatis mapper接口
 * @author: Guzman liu
 * @date:   2017年4月8日 下午5:09:33   
 *      
 */  
@Mapper
public interface StuMapper {
//  @Select("select * from stu where stu_id=#{stu_id}")
  
	StuVo findById( String id);

//  @Insert("insert into stu (stu_id,stu_name,stu_course,stu_tearch) values (#{stu_id},#{stu_name},#{stu_course},#{stu_tearch})")
	void insertPojo(@Param("stu_id") int id,@Param("stu_name") String name,@Param("stu_course") int course,@Param("stu_tearch") int tearch);

//  @Select("select * from stu")
	List<StuVo> findAll();
}
