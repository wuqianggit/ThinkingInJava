package holdingobjs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 销售管理系统
 * holdingobjs
 *
 * 2017/12/7-16:19
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/12/7.
 */

class Snow{}

class Powder extends Snow{}

class Light extends Powder{}

class Heavy extends Powder{}

class Crusty extends Snow{}

class Slush extends Snow{}

public class AsListInterface {

    public static void main(String[] args) {
        List<Snow> list=new ArrayList<Snow>();

        List<Snow> lights = Arrays.asList(new Light(),new Heavy());

    }
}
