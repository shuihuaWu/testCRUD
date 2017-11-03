package com.wsh.testCRUD.controller;

import com.wsh.testCRUD.model.Person;
import com.wsh.testCRUD.service.IPersonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wushuihua on 2017/10/10.
 */
@RestController
public class PersonController {
    @Resource(name = "personService")
    IPersonService personService;

    /**
     * 添加一个人员
     *
     * @param name
     * @param age
     * @return
     */
    @PostMapping(value = "/person")
    public Person personAdd(@RequestParam("name") String name,
                            @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return personService.addPerson(person);
    }

    /**
     * 查询所有人员
     *
     * @return
     */
    @GetMapping(value = "/person")
    private List<Person> personList() {
        return personService.queryAllPerson();
    }

    /**
     * 查询一个人员
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/person/{id}")
    public Person personFindOne(@PathVariable("id") Integer id) {
        return personService.queryPersonById(id);
    }

    /**
     * 删除一个人员
     *
     * @param id
     */
    @DeleteMapping(value = "/person/{id}")
    public void personDelete(@PathVariable("id") Integer id) {
        personService.deletePerson(id);
    }

    /**
     * 更新一个人员
     *
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PutMapping(value = "/person/{id}")
    public Person personUpdate(@PathVariable("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("age") Integer age) {
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(age);
        return personService.updatePerson(person);
    }
}
