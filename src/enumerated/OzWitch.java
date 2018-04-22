package enumerated;

/**
 *
 * enumerated
 * 向enum中添加新的方法
 * 2018/4/22-9:27
 * 2018
 * Created by wuqiang on 2018/4/22.
 */

public enum OzWitch {
    WEST("哈哈哈"),

    EAST("我是EAST");

    private String description;
    private OzWitch(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }


    public static void main(String[] args) {
        System.out.println(OzWitch.EAST.getDescription());
    }
}
