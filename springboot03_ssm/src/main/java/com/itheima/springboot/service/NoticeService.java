package com.itheima.springboot.service;

import java.util.List;

import com.itheima.springboot.pojo.Notice;

public interface NoticeService {

	List<Notice> findAllNotice();

	int count();

	List<Notice> findByPage(Integer page, Integer rows);
}
