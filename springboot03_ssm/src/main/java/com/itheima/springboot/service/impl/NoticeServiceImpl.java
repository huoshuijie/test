package com.itheima.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.springboot.mapper.NoticeMapper;
import com.itheima.springboot.pojo.Notice;
import com.itheima.springboot.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;
	 
	@Override
	public List<Notice> findAllNotice() {
		
		return noticeMapper.findAllNotic();
	}

	@Override
	public int count() {
		
		return noticeMapper.count();
	}

	@Override
	public List<Notice> findByPage(Integer page, Integer rows) {
		
		return noticeMapper.findByPage((page-1)*rows, rows);
	}

}
