package typeinfo;

import java.util.Random;

/**
 *
 * typeinfo
 *
 * 2018/1/9-7:43
 * 2018
 * Created by wuqiang on 2018/1/9.
 */

class Initable{
    static final int staticFinal=47;
    static final int staticFinal2=ClassInitialization.rand.nextInt(1000);

    static{
        System.out.println("Initializing Initable");
    }
}


class Initable2{
    static int staticNonFinal=147;

    static{
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal=74;

    static{
        System.out.println("Initializing Initable3");
    }
}


public class ClassInitialization {
    public static Random rand=new Random(47);

    public static void main(String[] args) {
        Class<Initable> initableClass = Initable.class;
        System.out.println("After creating Intable ref");
        System.out.println(Initable.staticFinal);
    }
}
