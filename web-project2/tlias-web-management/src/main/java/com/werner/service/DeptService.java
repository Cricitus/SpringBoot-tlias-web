package com.werner.service;

import com.werner.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门
     */
    public List<Dept> findAll();
    /**
     * 根据id删除部门
     */
    void deleteById(Integer id);
    /**
     * 新增部门
     */
    void save(Dept dept);

    Dept getById(Integer id);

    void update(Dept dept);
}
