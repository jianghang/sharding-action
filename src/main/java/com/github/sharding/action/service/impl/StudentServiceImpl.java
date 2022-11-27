package com.github.sharding.action.service.impl;

import com.github.sharding.action.dao.StudentMapper;
import com.github.sharding.action.entity.StudentEntity;
import com.github.sharding.action.service.StudentService;
import com.github.sharding.action.view.StudentView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public StudentView getStudent(Integer id) {
        StudentEntity studentEntity = studentMapper.selectById(id);
        StudentView studentView = new StudentView();
        BeanUtils.copyProperties(studentEntity, studentView);
        return studentView;
    }
}
