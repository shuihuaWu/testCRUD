package com.wsh.testCRUD.service.impl;

import com.wsh.testCRUD.dao.IPersonDao;
import com.wsh.testCRUD.model.Person;
import com.wsh.testCRUD.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by wushuihua on 2017/10/10.
 */
@Service(value = "personService")
@Transactional
public class PersonService implements IPersonService {
    //jdk提供的按名称装配
   /* @Resource (name="personDao")
    IPersonDao personDao;*/
    /*Spring提供的自动装配，按类型装配*/
    @Autowired
    private IPersonDao personDao;

    @Override
    public Person addPerson(Person person) {
        return personDao.save(person);
    }

    @Override
    public List<Person> addPerson(List<Person> list) {
        return personDao.saveAll(list);
    }

    @Override
    public void deletePerson(Person person) {
        personDao.delete(person);
    }

    @Override
    public void deletePerson(Integer id) {
        personDao.deleteById(id);
    }

    @Override
    public void deletePerson(List<Person> list) {
        personDao.deleteAll(list);
    }

    @Override
    public Person updatePerson(Person person) {
       return personDao.saveAndFlush(person);
    }

    @Override
    public boolean existPerson(Integer id) {
        return personDao.existsById(id);
    }

    @Override
    public Person queryPersonById(Integer id) {
        Optional<Person> p=personDao.findById(id);
        return p.orElse(null);
    }

    @Override
    public List<Person> queryAllPerson() {
        return personDao.findAll();
    }

    @Override
    public List<Person> queryListPerson(List<Integer> list) {
        return  personDao.findAllById(list);
    }

    @Override
    public List<Person> queryAllPersonBySort(Sort sort) {
        return personDao.findAll(sort);
    }

    @Override
    public Page<Person> queryPersonByPage(Pageable pageable) {
        return personDao.findAll(pageable);
    }
}
