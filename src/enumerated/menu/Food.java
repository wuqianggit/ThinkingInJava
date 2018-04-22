package enumerated.menu;

/**
 *
 * enumerated.menu
 *
 * 2018/4/22-9:49
 * 2018
 * Created by wuqiang on 2018/4/22.
 */
public interface Food {
    enum Appetizer implements Food{
        SALAD,SOUP
    }

    enum Dessert implements Food{
        FRUIT,ICE_CREAM
    }
}
