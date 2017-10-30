package access.dessert;

/**
 * 销售管理系统
 * access.dessert
 *
 * 2017/10/30-14:53
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/10/30.
 */
class Cookie {
    public Cookie() {
        System.out.println("Cookie ");
    }

    /*默认 是包访问权限*/
    void bite() {
        System.out.println("bite");
    }

}
