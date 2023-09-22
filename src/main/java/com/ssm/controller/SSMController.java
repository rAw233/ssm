package com.ssm.controller;

import com.ssm.dao.EmpDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/ssm")
public class SSMController {

    @Resource
    private EmpDao empDao;

    @RequestMapping("/test")
    public String test(){
        System.out.println("test~~~");
        empDao.selectByEmpNo(1234);
        return "success";
    }

}
