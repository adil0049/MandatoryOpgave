package com.springmandatory.demo.Service;

import com.springmandatory.demo.Model.Entities.Student;
import com.springmandatory.demo.Repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements IStudentService {

    @Autowired
    IStudentRepository studentRepository;

    @Override
    public List<Student> fetchAllStudents(){
        return studentRepository.findAll();
    };


    @Override
    public Student fetchOneStudent(int id){
        return studentRepository.getOne(id);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.getOne(student);
    }

    @Override
    void deleteStudent(int id); {
        return studentRepository.getOne(id);
    }
    public Student updateStudent(int id); {
        return studentRepository.getOne(id);
    }
}
