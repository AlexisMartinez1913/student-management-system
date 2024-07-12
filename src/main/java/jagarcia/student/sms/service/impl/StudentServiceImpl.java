package jagarcia.student.sms.service.impl;

import jagarcia.student.sms.dto.StudentDto;
import jagarcia.student.sms.entity.Student;
import jagarcia.student.sms.mapper.StudentMapper;
import jagarcia.student.sms.repository.StudentRepository;
import jagarcia.student.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        return students.stream()
                .map((StudentMapper::mapToStudentDto)).collect(Collectors.toList());
    }

    @Override
    public void createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        studentRepository.save(student);
    }

    @Override
    public StudentDto getStudentById(Long studentId) {
        Student student = studentRepository.findById(studentId).get();
        return StudentMapper.mapToStudentDto(student);
    }
}
