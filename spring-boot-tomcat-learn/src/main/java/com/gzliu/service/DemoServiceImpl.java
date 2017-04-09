package com.gzliu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzliu.mapper.StuMapper;
import com.gzliu.vo.StuVo;

@Service
public class DemoServiceImpl implements DemoService{

	@Autowired
	private StuMapper stuMapper;
	
	public void findAllStu() {
		// TODO Auto-generated method stub
		List<StuVo> list = stuMapper.findAll();
		System.out.println(list);
	}
	

}
