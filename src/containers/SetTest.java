package containers;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * containers
 *
 * 2018/4/13-21:40
 * 2018
 * Created by wuqiang on 2018/4/13.
 */
class People{
    @Override
    public int hashCode() {
        return 1;
    }

    @Override public boolean equals(Object obj) {
        return true;
    }
}
public class SetTest {
    /**
     * 测试，Set是否唯一
     */
    @Test
    public void testSet(){
        Set<People> set=new HashSet<People>();
        set.add(new People());
        set.add(new People());

        System.out.println(set.size());
    }
}

