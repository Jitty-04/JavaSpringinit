package com.nest.studentappnew_backend.dao;

import com.nest.studentappnew_backend.model.Students;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Students,Integer> {

}
