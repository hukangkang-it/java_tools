package com.hkk.toolsmanage.lickdog;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class LickDogManagerBo {


    /**
     * 姓名
     */
    private String studentName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private int age;

    /**
     * 出生日期
     */
    private String birthDate;

    /**
     * 入学日期
     */
    private String entranceDate;


    /**
     * 联系电话
     */
    private int phone;

    /**
     * 家庭住址
     */
    private String address;

    /**
     * 教师姓名
     */
    private String teacherName;

    /**
     * 教师联系电话
     */
    private int teacherPhone;

}



