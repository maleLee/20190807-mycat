package com.aaa.lee.mycat.service;

import com.aaa.lee.mycat.mapper.StudentMapper;
import com.aaa.lee.mycat.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/7 11:20
 * @Description
 **/
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public int addStu(Student student) {
        return studentMapper.insert(student);
    }

    public List<Student> selectAllStudent() {
        return studentMapper.selectAll();
    }

}
