package com.hkk.toolsweb;

import com.hkk.toolsapi.lickdog.LickDogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;


@Slf4j
public class QueryStudentByNameTest extends SpringBootTestBaseInfo {

    @Autowired
    private LickDogService lickDogService;

    @Test
    public void testQuery() {

        String result = lickDogService.queryStudentByName("李兵");
        System.out.println(result);

    }

    /**
     * 删除学生信息
     */
    @Test
    public void deleteStudent(){

        String result = lickDogService.deleteStudentByName("胡康康");
        System.out.println(result);
    }


}
