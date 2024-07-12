package jagarcia.student.sms.controller;

import jagarcia.student.sms.dto.StudentDto;
import jagarcia.student.sms.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler method to handle list students request
    @GetMapping("/students")
    public String listStudents(Model model) {
        List<StudentDto> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }

    //handler method to handle new student request
    @GetMapping("/students/new")
    public String newStudent(Model model) {
        //student model object to store student form data
        StudentDto studentDto = new StudentDto();
        model.addAttribute("student", studentDto);
        return "create_student";
    }
    //handler method to handle save student form submit request
    @PostMapping("/students")
    public String saveStudent(@Valid @ModelAttribute("student") StudentDto student,
                              BindingResult result, Model model) {

        //validations
        if (result.hasErrors()) {
            model.addAttribute("student", student);
            return "create_student";
        }
        studentService.createStudent(student);
        return "redirect:/students";
    }

    //handler method to hanlde edit student request
    @GetMapping("/student/{studentId}/edit")
    public String editStudent(@PathVariable("studentId") Long studentId,
                              Model model) {
        StudentDto student = studentService.getStudentById(studentId);
        model.addAttribute("student", student);
        return "edit_student";
    }



}
