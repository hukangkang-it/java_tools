package com.hkk.toolsservice.lickdog;

import com.hkk.toolsapi.lickdog.LickDogService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class LickDogServiceImpl implements LickDogService {


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
}