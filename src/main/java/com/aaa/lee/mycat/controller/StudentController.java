package com.aaa.lee.mycat.controller;

import com.aaa.lee.mycat.model.Student;
import com.aaa.lee.mycat.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/7 11:20
 * @Description
 **/
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/addStu")
    public int addStu() {
        Student student = new Student();
        student.setId(4L);
        student.setStudentName("zhangsan");
        student.setStudentAge(20);
        return studentService.addStu(student);
    }

    @RequestMapping("/all")
    public List<Student> selectAllStudent(){
        return studentService.selectAllStudent();
    }

}
