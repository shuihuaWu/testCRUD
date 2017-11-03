package com.wsh.testCRUD.dao;

import com.wsh.testCRUD.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wushuihua on 2017/10/10.
 */
@Repository
public interface IPersonDao extends JpaRepository<Person,Integer> {
}
