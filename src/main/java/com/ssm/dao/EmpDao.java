package com.ssm.dao;


import com.ssm.bean.Emp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface EmpDao {


    Emp selectByEmpNo(Integer empNo);

    Emp selectByCondition(Emp emp);

    List<Emp> selectList(@Param("empNos") List<Integer> empNos);
}
