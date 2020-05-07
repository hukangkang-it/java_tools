package com.hkk.toolsservice.lickdog;


import com.hkk.toolsapi.lickdog.LickDogService;
import com.hkk.toolsapi.lickdog.request.AddStudentReqDTO;
import com.hkk.toolsmanage.Result;
import com.hkk.toolsmanage.StudentInfoManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author yanglvsen
 * @version Id:
 */
@Slf4j
@Service
@Component
 public class LickDogServiceImpl implements LickDogService {
    @Autowired
    private StudentInfoManager studentInfoManager;

    @Override
    public Result<Boolean> addStudent(AddStudentReqDTO addStudentReqDTO) {
        return null;
    }

}

