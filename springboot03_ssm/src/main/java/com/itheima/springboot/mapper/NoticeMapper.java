package com.itheima.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.itheima.springboot.pojo.Notice;

@Mapper
public interface NoticeMapper {
	
	@Select("select id, content, title from notice")
	List<Notice> findAllNotic();
	
	@Select("select count(1) from notice")
	int count();

	List<Notice> findByPage(@Param("start")Integer start, @Param("rows")Integer rows);
}
