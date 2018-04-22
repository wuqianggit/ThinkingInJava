package enumerated;

/**
 *
 * enumerated
 * 枚举类，元素表示 警报传感器的安装位置
 * 2018/4/22-10:01
 * 2018
 * Created by wuqiang on 2018/4/22.
 */
public enum AlarmPoints {
    STAIR1,STAIR2,STAIR3;

    public void f(){
        System.out.println("普通的f");
    }

    private void privateF(){
        System.out.println("我是私有的方法");
    }
//    abstract void abstractFunction(); 如果有
}
