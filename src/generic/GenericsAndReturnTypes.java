package generic;

/**
 *
 * generic
 *
 * 2018/4/8-21:33
 * 2018
 * Created by wuqiang on 2018/4/8.
 */

interface GenericGeter<T extends GenericGeter<T>>{
    T get();
}

interface Getter extends GenericGeter<Getter>{}

public class GenericsAndReturnTypes {
    void test(Getter getter){
        Getter result = getter.get();
        GenericGeter g=getter.get();
    }
}
