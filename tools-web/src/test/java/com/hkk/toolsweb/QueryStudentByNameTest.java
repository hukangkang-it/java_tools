package com.hkk.toolsweb;

import com.hkk.toolsapi.lickdog.LickDogService;
import com.hkk.toolsweb.SpringBootTestBaseInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.testng.annotations.Test;



public class QueryStudentByNameTest extends SpringBootTestBaseInfo {

    @Autowired
    private LickDogService lickDogService;

    @Test
    public void testQuery() {

        String result = lickDogService.queryStudentByName("李兵");
        System.out.println(result);

    }


}
