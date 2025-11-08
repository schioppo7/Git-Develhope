package co.develhope.CRUDTESTV1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //crea un nuovo studente
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    //ottieni la lista di studenti
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    //ottieni uno studente con id
    public Optional<Student> getStudentid(Long id) {
        return studentRepository.findById(id);
    }

    //modificare lo studente
    public Optional<Student> updateStudent(Long id, Student studentDetails) {
        Optional<Student> studentOptional = studentRepository.findById(id);

        if (studentOptional.isEmpty()) {
            return Optional.empty();
        }

        Student student = studentOptional.get();
        student.setName(studentDetails.getName());
        student.setSurname(studentDetails.getSurname());
        student.setIsWorking(studentDetails.getIsWorking());

        return Optional.of(studentRepository.save(student));
    }

    //modificare Isworking dello studente
    public Optional<Student> updateStudentWorkingStatus(Long id, boolean isWorking) {
        Optional<Student> studentOptional = studentRepository.findById(id);

        if (studentOptional.isEmpty()) {
            return Optional.empty();
        }

        Student student = studentOptional.get();
        student.setIsWorking(isWorking);

        return Optional.of(studentRepository.save(student));
    }

    //eliminare lo studente
    public boolean deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }
}