package com.gede.beatles.dao;

import com.gede.beatles.entity.Subject;

public interface SubjectDao {

    public void save(Subject subject);

    public Subject findById(int id);

    public void update(Subject subject);

    public void delete(int id);

}
