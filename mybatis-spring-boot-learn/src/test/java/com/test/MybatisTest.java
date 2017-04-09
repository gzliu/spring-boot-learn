package com.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.MybatisApplication;
import com.mapper.StuMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = MybatisApplication.class)
public class MybatisTest {

	@Autowired
    private StuMapper mapper;

    @org.junit.Test
    public void testMybatis(){
        System.out.println(mapper.findAll());
    }
}
