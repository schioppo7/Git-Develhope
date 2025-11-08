package co.develhope.CRUDTESTV1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //crea studente
    @PostMapping
    public ResponseEntity<Student> newStudent(@RequestBody Student student) {
        Student studentNew = studentService.createStudent(student);
        return new ResponseEntity<>(studentNew, HttpStatus.CREATED);
    }

    //lista degli studenti
    @GetMapping
    public List<Student> getStudent() {
        return studentService.getAllStudent();
    }

    //studente con id
    @GetMapping(path = "{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable("studentId") Long studentId) {
        return studentService.getStudentid(studentId)
                .map(student -> new ResponseEntity<>(student, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //modifica le informazioni dello studente
    @PutMapping(path = "{studentId}")
    public ResponseEntity<Student> updateStudent(@PathVariable("studentId") Long studentId, @RequestBody Student studentDetails) {

        Optional<Student> updatedStudent = studentService.updateStudent(studentId, studentDetails);

        return updatedStudent
                .map(student -> new ResponseEntity<>(student, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //modifica lo stato isWorking
    @PatchMapping(path = "{studentId}/working")
    public ResponseEntity<Student> updateStudentWorking(@PathVariable("studentId") Long studentId, @RequestParam("working") boolean isWorking) {

        Optional<Student> updatedStudent = studentService.updateStudentWorkingStatus(studentId, isWorking);

        return updatedStudent
                .map(student -> new ResponseEntity<>(student, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //elimina lo studente
    @DeleteMapping(path = "{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("studentId") Long studentId) {
        boolean deleted = studentService.deleteStudent(studentId);

        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
