package com.hkk.toolsmanage.lickdog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LickDogBiz {


    @Autowired
    private LickDogManager  lickDogManager;

    /**
     * 新增学生信息
     */
    public void addStudent() {
        lickDogManager.addStudent();
    }

}
