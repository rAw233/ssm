package com.ssm.dao;


import com.ssm.bean.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao {

    Person select(Person person);

    List<Person> selectPersonList(Person person);

}
