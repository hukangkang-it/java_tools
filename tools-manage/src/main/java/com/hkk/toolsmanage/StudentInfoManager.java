package com.hkk.toolsmanage;

import com.hkk.toolsdal.model.StudentDo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import writeMapper.StudentMapper;

/**
 * @author yanglvsen
 * @version   444
 */
@Slf4j
@Component
public class StudentInfoManager {
    @Autowired
    StudentInfoManager studentInfoManager;

    @Autowired
    StudentMapper studentMapper;

    /**
     * 查询学生信息
     * @param studentDo
     * @return
     */
    public Boolean addMerchantStore(StudentDo studentDo){
        log.info("新增零售商门店请求业务BO：{}", studentDo);
        if(studentDo == null){
            return null;
        }
        int insert = studentMapper.insert(studentDo);
        return insert > 0;
    }


}
