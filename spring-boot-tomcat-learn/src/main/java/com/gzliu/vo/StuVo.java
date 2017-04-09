package com.gzliu.vo;

import java.io.Serializable;

public class StuVo implements Serializable{

	private static final long serialVersionUID = -3362487059766789798L;
	private  Integer stu_id;
    private  String stu_name;
    private  Integer stu_course;
    private  Integer stu_tearch;

    public Integer getStu_course() {
        return stu_course;
    }

    public void setStu_course(Integer stu_course) {
        this.stu_course = stu_course;
    }

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public Integer getStu_tearch() {
        return stu_tearch;
    }

    public void setStu_tearch(Integer stu_tearch) {
        this.stu_tearch = stu_tearch;
    }

    @Override
    public String toString() {
        return "CityPojo{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_course=" + stu_course +
                ", stu_tearch=" + stu_tearch +
                '}';
    }


}
