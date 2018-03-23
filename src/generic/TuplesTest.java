package generic;

import org.junit.Test;
import utils.TwoTuple;

/**
 * 销售管理系统
 * generic
 * <p>
 * 2018/3/22-15:52
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 15:52.
 */
public class TuplesTest {
    @Test
    public void testTuples(){
        TwoTuple twoTuple = new TwoTuple<String,Integer>("123",123);
        System.out.println(twoTuple.a);
    }
}
