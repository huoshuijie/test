package com.itheima.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.springboot.pojo.Notice;
import com.itheima.springboot.service.NoticeService;

@RestController
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("list")
	public List<Notice> list(){
		return noticeService.findAllNotice();
	}
	
	@PostMapping("findByPage")
	public Map<String, Object> findByPage(Integer page, Integer rows){
		Map<String, Object> map = new HashMap<String, Object>();
		int total = noticeService.count();
		map.put("total", total);
		List<Notice> noticeList = noticeService.findByPage(page, rows);
		map.put("rows", noticeList);
		return map;
	}
}
