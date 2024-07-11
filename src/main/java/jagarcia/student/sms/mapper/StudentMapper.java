package jagarcia.student.sms.mapper;

import jagarcia.student.sms.dto.StudentDto;
import jagarcia.student.sms.entity.Student;

public class StudentMapper {
    //mapear a studentdto
    public static StudentDto mapToStudentDto(Student student) {
        return new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
    }
    public static Student mapToStudent(StudentDto studentDto) {
        return new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail()
        );
    }
}
