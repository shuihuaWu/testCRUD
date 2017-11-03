package com.wsh.testCRUD.service;

import com.wsh.testCRUD.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by wushuihua on 2017/10/10.
 */
public interface IPersonService {
    /**
     *
     * @Title: addPerson
     * @Description: TODO(添加用户)
     * @return: void
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    Person addPerson(Person person);

    /**
     *
     * @Title: addPerson
     * @Description: TODO(批量添加用户)
     * @param list
     * @return: void
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    List<Person> addPerson(List<Person> list);

    /**
     *
     * @Title: deletePerson
     * @Description: TODO(删除用户)
     * @param person
     * @return: void
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    void deletePerson(Person person);

    /**
     *
     * @Title: deletePerson
     * @Description: TODO(删除用户)
     * @param id
     * @return: void
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    void deletePerson(Integer id);

    /**
     *
     * @Title: deletePerson
     * @Description: TODO(删除用户)
     * @param list
     * @return: void
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    void deletePerson(List<Person> list);

    /**
     *
     * @Title: updatePerson
     * @Description: TODO(编辑用户)
     * @param person
     * @return: void
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    Person updatePerson(Person person);

    /**
     *
     * @Title: existPerson
     * @Description: TODO(判断用户是否存在)
     * @param id
     * @return
     * @return: boolean
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    boolean existPerson(Integer id);

    /**
     *
     * @Title: queryPersonById
     * @Description: TODO(查询用户)
     * @param id
     * @return
     * @return: Person
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    Person queryPersonById(Integer id);

    /**
     *
     * @Title: queryAllPerson
     * @Description: TODO(查询用户)
     * @return
     * @return: List<Person>
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    List<Person> queryAllPerson();

    /**
     *
     * @Title: queryListPerson
     * @Description: TODO(查询用户)
     * @param list
     * @return
     * @return: List<Person>
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    List<Person> queryListPerson(List<Integer> list);

    /**
     *
     * @Title: queryAllPersonSort
     * @Description: TODO(查询用户)
     * @param sort
     * @return
     * @return: List<Person>
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    List<Person> queryAllPersonBySort(Sort sort);

    /**
     *
     * @Title: queryPersonByPage
     * @Description: TODO(查询用户)
     * @param pageable
     * @return
     * @return: Page<Person>
     * @author: eleven
     * @date: 2014-3-25
     * @history: Date  Author  Version  Description
     *           ---------------------------------------------------------*
     *           2014-3-25  eleven v1.0.0   修改原因
     */
    Page<Person> queryPersonByPage(Pageable pageable);
}
