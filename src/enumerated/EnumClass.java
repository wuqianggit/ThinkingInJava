package enumerated;

/**
 *
 * enumerated
 * 枚举类的基本作用
 * 2018/4/22-9:18
 * 2018
 * Created by wuqiang on 2018/4/22.
 */

enum Weak{
    MONDAY,
    TUESDAY,
    WEDENESDAY
}

public class EnumClass {
    public static void main(String[] args) {
        for(Weak weak:Weak.values()){/*遍历 枚举*/
            System.out.println(weak.name());

        }

    }
}
