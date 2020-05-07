package com.hkk.toolsapi.lickdog;


import com.hkk.toolsapi.lickdog.request.AddStudentReqDTO;
import com.hkk.toolsmanage.Result;


/**
 * @author hkk
 * @version id：hkk
 * @api 新增学生信息接口
 * @desc 新增学生信息接口
 */
public interface LickDogService {

    /**
     * 新增学生基本信息
     *
     * @param addStudentReqDTO
     * @return
     */
    Result<Boolean> addStudent(AddStudentReqDTO addStudentReqDTO);

}
