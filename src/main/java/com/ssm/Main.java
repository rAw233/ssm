package com.ssm;

import com.ssm.bean.Emp;
import com.ssm.dao.EmpDao;

import javax.annotation.Resource;

public class Main {

    @Resource
    private static EmpDao empDao;

    public static void main(String[] args) {
        Emp emp = empDao.selectByEmpNo(1234);
        System.out.println(emp);
    }
}