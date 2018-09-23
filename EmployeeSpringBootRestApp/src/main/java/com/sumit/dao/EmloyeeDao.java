package com.sumit.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sumit.entity.Employee;

@Repository
public interface EmloyeeDao extends CrudRepository<Employee, Integer> {

}
