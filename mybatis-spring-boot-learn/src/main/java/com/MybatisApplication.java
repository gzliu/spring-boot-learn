package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mapper.StuMapper;
import com.pojo.CityPojo;


/**
 * Created by Administrator on 2017/3/20.
 */
@SpringBootApplication
public class MybatisApplication  implements CommandLineRunner {

    public static  void main(String[] args){
        SpringApplication.run(MybatisApplication.class, args);
    }

    @Autowired
    private StuMapper mapper;


    @Override
    public void run(String... strings) throws Exception {
        CityPojo ctity = mapper.findById("3");

        System.out.println(ctity);
//        mapper.insertPojo(2,"11",10,5);
        List<CityPojo> list = mapper.findAll();
        System.out.println(list);
    }
}
