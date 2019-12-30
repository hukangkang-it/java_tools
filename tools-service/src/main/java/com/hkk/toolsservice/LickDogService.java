package com.hkk.toolsservice;

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
      Boolean queryStutendByName(String name);


}
