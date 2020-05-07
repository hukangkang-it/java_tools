package testStudent;

import com.hkk.toolsapi.lickdog.LickDogService;
import com.hkk.toolsapi.lickdog.request.AddStudentReqDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class LickDogServiceTest extends Test{

    @Autowired
    private LickDogService lickDogService;

    @org.testng.annotations.Test
    public void addStudent(){
        AddStudentReqDTO addStudentReqDTO = new AddStudentReqDTO();
        addStudentReqDTO.setStudentName("2525");
        addStudentReqDTO.setSex("2525");
        addStudentReqDTO.setAge(0);
        addStudentReqDTO.setBirthDate("5252");
        addStudentReqDTO.setEntranceDate("2525");
        addStudentReqDTO.setCreateBy("2525");
        addStudentReqDTO.setPhone(0);
        addStudentReqDTO.setAddress("25252");
        addStudentReqDTO.setTeacherName("25525");
        addStudentReqDTO.setTeacherPhone(0);




    }
}

