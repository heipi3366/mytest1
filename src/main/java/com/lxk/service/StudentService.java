package com.lxk.service;

import com.lxk.dao.StudentDao;
import com.lxk.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lxk on 2017/3/27
 */
@Service("studentService")
public class StudentService {

    @Resource(name = "studentDao")
    private StudentDao dao;
    //neil add 20180609
    public List<Student> getAllStudent() {
        int x = 0;
        return dao.findAll();
    }
}
