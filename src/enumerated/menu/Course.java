package enumerated.menu;

/**
 *
 * enumerated.menu
 *
 * 2018/4/22-9:48
 * 2018
 * Created by wuqiang on 2018/4/22.
 */
public enum  Course {

    APPETIZER(Food.Appetizer.class),

    DESSERT(Food.Dessert.class);

    Food[] valuess;

    private Course(Class<? extends Food> kind){
        Food[] enumConstants = kind.getEnumConstants();/*获取枚举中所有的元素*/
    }

}
