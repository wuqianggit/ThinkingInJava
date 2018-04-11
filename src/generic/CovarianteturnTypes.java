package generic;

/**
 *
 * generic
 * 参数协变
 * 2018/4/8-21:28
 * 2018
 * Created by wuqiang on 2018/4/8.
 */

class Base{ }
class Derived extends Base{}

interface OrdinaryGetter{
    Base get();
}
interface DerivedGetter extends OrdinaryGetter{
    /**
     * 子类方法，覆盖了父类方法，但是 返回值的类型与父类不同。
     *
     * 子类方法应该能够返回比它覆盖的基类方法更具体的类型
     * @return
     */
    @Override
    Derived get();
}
public class CovarianteturnTypes {
    void test(DerivedGetter d){
        Derived d2 = d.get();
    }
}
