package com.hkk.toolsservice.lickdog;

import com.hkk.toolsapi.lickdog.LickDogService;
import com.hkk.toolsapi.lickdog.request.AddStudentReqDTO;
import com.hkk.toolsmanage.Result;
import com.hkk.toolsmanage.lickdog.LickDogBiz;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class LickDogServiceImpl implements LickDogService {


    @Autowired
    private LickDogBiz lickDogBiz;

    /**
     * 根据姓名查询学生信息
     *
     * @param name
     * @return
     */
    @Override
    public String queryStudentByName(String name) {
        if("李兵".equals(name)){
            return "恭喜你，接口调用成功";
        }
        return "接口调用失败，请确认正确再试";
    }

    /**
     * 删除学生信息
     *
     * @param name
     * @return
     */
    @Override
    public String deleteStudentByName(String name){
        if("胡康康".equals(name)){
            return "恭喜你，删除成功";
        }
        return "调用接口失败";
    }

    @Override
    public String addStudentByName(String name){
        lickDogBiz.addStudent();

        return  "";
    }

    @Override
    public Result<Boolean> addStudent(AddStudentReqDTO addStudentReqDTO) {


        return null;
    }
}