package com.hkk.toolsapi.lickdog;


import com.hkk.toolsapi.lickdog.request.AddStudentReqDTO;
import com.hkk.toolsmanage.Result;

/**
 *
 * 主要用来调用赵融璋的数据库
 *
 */
public interface LickDogService {

      /**
       * 根据姓名查询学生信息
       *
       * @param name
       * @return
       */
      String queryStudentByName(String name);


      /**
       * 删除学生信息
       *
       * @param name
       * @return
       */
      String deleteStudentByName(String name);


      /**
       * 新增学生信息
       *
       * @param name
       * @return
       */
      String addStudentByName(String name);

      /**
       * 新增学生基本信息
       *
       * @param addStudentReqDTO
       * @return
       */
      Result<Boolean> addStudent(AddStudentReqDTO addStudentReqDTO);

}
