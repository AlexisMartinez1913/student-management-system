package jagarcia.student.sms.service;

import jagarcia.student.sms.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
}
