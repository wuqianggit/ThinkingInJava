package containers;

import utils.CollectionData;
import utils.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * containers
 * 初始化一个容器
 * 2018/4/12-21:21
 * 2018
 * Created by wuqiang on 2018/4/12.
 */

class Government implements Generator<String>{
    String[] foundation="a b c no base for government".split(" ");
    private int index;
    /**
     * 生成String
     * @return
     */
    @Override
    public String next() {
        return foundation[index++];
    }
}
public class CollectionDataTest {
    public static void main(String[] args) {
        Generator g=new Government();
        Set<String> set=new LinkedHashSet<String>(new CollectionData<String>(g,6));

        set.addAll(CollectionData.list(new Government(),6));

        System.out.println(set);
    }

}
