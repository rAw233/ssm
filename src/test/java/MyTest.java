import com.ssm.dao.EmpDao;
import org.junit.Test;

import javax.annotation.Resource;

public class MyTest {


    @Resource
    private EmpDao empDao;

    @Test
    public void test(){

        empDao.selectByEmpNo(1234);
    }

}
