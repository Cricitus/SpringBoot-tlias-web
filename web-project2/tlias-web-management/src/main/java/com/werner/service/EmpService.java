package com.werner.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.werner.mapper.EmpMapper;
import com.werner.pojo.Emp;
import com.werner.pojo.EmpQueryParam;
import com.werner.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {
    /**
     * 分页查询
     */
    //PageResult page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);
    PageResult page(EmpQueryParam empQueryParam);

    /**
     * 添加员工
     * @param emp
     */
    void save(Emp emp);
    /**
     * 批量删除员工
     */
    void deleteByIds(List<Integer> ids);
    /**
     * 根据ID查询员工的详细信息
     */
    Emp getInfo(Integer id);
    /**
     * 更新员工信息
     * @param emp
     */
    void update(Emp emp);
}