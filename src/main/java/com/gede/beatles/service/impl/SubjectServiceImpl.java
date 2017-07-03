package com.gede.beatles.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gede.beatles.dao.SubjectDao;
import com.gede.beatles.entity.Subject;
import com.gede.beatles.service.SubjectService;

@Service(value = "subjectService")
public class SubjectServiceImpl implements SubjectService {

    @Resource
    private SubjectDao subjectDao;

    @Override
    public Subject getById(int id) {
        return subjectDao.findById(id);
    }

}
