package com.hkk.toolsapi.lickdog;

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


}
