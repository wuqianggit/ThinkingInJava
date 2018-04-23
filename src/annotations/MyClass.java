package annotations;/*包名*/

/**
 *
 * annotations
 *
 * 2018/4/22-11:00
 * 2018
 * Created by wuqiang on 2018/4/22.
 */
public class MyClass { /*l类*/

    private String name;/* 字段名*/


    MyClass(){ /*构造方法*/

    }

    public void testF(){/*方法名*/
        @TestField
        int i;
    }

    public void testF(int t){/*方法的参数名*/

    }
}
